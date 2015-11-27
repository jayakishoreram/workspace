package com.mgn;

import java.util.Arrays;
import java.util.Scanner;

public class Morgan {

	
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
    int res;
    
    int _movie_start_size = Integer.parseInt(in.nextLine());
    int[] _movie_start = new int[_movie_start_size];
    int _movie_start_item;
    for(int _movie_start_i = 0; _movie_start_i < _movie_start_size; _movie_start_i++) {
        _movie_start_item = Integer.parseInt(in.nextLine());
        _movie_start[_movie_start_i] = _movie_start_item;
    }
    
    
    int _movie_end_size = Integer.parseInt(in.nextLine());
    int[] _movie_end = new int[_movie_end_size];
    int _movie_end_item;
    for(int _movie_end_i = 0; _movie_end_i < _movie_end_size; _movie_end_i++) {
        _movie_end_item = Integer.parseInt(in.nextLine());
        _movie_end[_movie_end_i] = _movie_end_item;
    }
    
    res = getMaxMovies(_movie_start, _movie_end);
    System.out.println(res);
    
}
static int getMaxMovies(int[] movie_start, int[] movie_end) {

	
	int totalDuration = movie_end[movie_end.length-1] - movie_start[0];
	int [] duration = new int[movie_start.length];
	
	
	for(int i=0;i<movie_start.length; i++){
		duration[i] =  movie_start[i] - movie_end[i];
	}
	
	Arrays.sort(duration);
	int count = 0;
	for(int i = 0; i< movie_start.length; i++){
		count = count +  duration[i];
		
		if(count == totalDuration)
			return i;
		else if(count > totalDuration)
		return i--;
	}
		
	
return duration.length;
}
}
