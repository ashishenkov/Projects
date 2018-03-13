/*
 ============================================================================
 Name        : Lesson1.c
 Author      : Alexandr Shishenkov
 Version     : 0.1
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	// \n \t \\ \0
	printf("!!!Hello World!!!"); /* prints !!!Hello World!!! */
	printf("This is a new \trow with tab ");
	printf("This is a new row with \\ symbol ");
	printf("This is a new row with \0");
	return 0;
}
