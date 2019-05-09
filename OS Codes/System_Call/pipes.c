#include<stdio.h> 
#include<stdlib.h> 
#include<unistd.h> 
#include<sys/types.h> 
#include<string.h> 
#include<sys/wait.h> 

int main() 
{ 
    int fd1[2];
    int fd2[2]; 
 
    char input_str[100]; 
    pid_t p; 

    if (pipe(fd1)==-1) 
    { 
        fprintf(stderr, "Pipe Failed" ); 
        return 1; 
    } 
    if (pipe(fd2)==-1) 
    { 
        fprintf(stderr, "Pipe Failed" ); 
        return 1; 
    } 
    printf("Enter the message :");
    scanf("%s", input_str); 
    p = fork(); 

    if (p < 0) 
    { 
        fprintf(stderr, "fork Failed" ); 
        return 1; 
    } 

    else if (p > 0) 
    { 
        char new_str[100];
        close(fd1[0]); 
        write(fd1[1], input_str, strlen(input_str)+1); 
        close(fd1[1]); 
        wait(NULL); 
        close(fd2[1]);
        read(fd2[0], new_str, 100); 
        printf("Changed string: %s\n", new_str); 
        close(fd2[0]); 
    } 

    else
    { 
        close(fd1[1]); 
        char original_str[100]; 
        read(fd1[0], original_str, 100);  
        int i; 
        for (i=0; i<strlen(original_str); i++) 
        {
            int x=(int)(original_str[i]);
            if(x>=65&&x<=90)
            {
                original_str[i]=(char)(x+32);
            }
            if(x>=97&&x<=122)
            {
                original_str[i]=(char)(x-32);
            }
        }
        original_str[i]='\0';
        close(fd1[0]); 
        close(fd2[0]); 
        write(fd2[1], original_str, strlen(original_str)+1); 
        close(fd2[1]); 
        exit(0); 
    } 
} 