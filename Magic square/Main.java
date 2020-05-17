#include <stdio.h>
#include<iostream>
using namespace std;
int main() {
 int A[50][50];
 int i, j, M, N;
 int size;
 int rowsum, columnsum, diagonalsum;
 int magic = 0;
 
 
cin>>M;
N=M;
 if(M==N) {
 
 for(i=0; i<M; i++) {
 for(j=0; j<N; j++) {
 cin>>A[i][j];
 }
 }
 

 
 // calculate diagonal sum 
 diagonalsum = 0;
 for(i=0; i<M; i++) {
 for(j=0; j<N; j++) {
 if(i==j) {
 diagonalsum = diagonalsum + A[i][j];
 }
 }
 }
 
 // calculate row sum
 for(i=0; i<M; i++) {
 rowsum = 0;
 for(j=0; j<N; j++) {
 rowsum = rowsum + A[i][j];
 }
 if(rowsum != diagonalsum) {
cout<<"No";
 return 0;
 }
 }
 
 // calculate column sum
 for(i=0; i<M; i++) {
 columnsum = 0;
 for(j=0; j<N; j++) {
 columnsum = columnsum + A[j][i];
 }
 if(columnsum != diagonalsum) {
 cout<<"No";
 return 0;
 }
 }

 cout<<"Yes";
 }
}