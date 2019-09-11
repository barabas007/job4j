package ru.job4j.array;

public class EndsWith {

    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        // проверить. что массив word имеет последние элементы одинаковые с post

          for(char i = 0; i < word.length; i++){

              for (char j = 0; j < post.length; j++){

                  if(word[word.length -1] == post[post.length -1] & word[word.length - 2] == post[post.length - 2]){

                      return true;
                  }
              }
          }
        return result;
    }
}
