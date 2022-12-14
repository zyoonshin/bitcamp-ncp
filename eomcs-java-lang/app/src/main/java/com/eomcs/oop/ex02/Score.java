package com.eomcs.oop.ex02;

//다른 패키지에서도 이 클래스를 사용할 수 있도록 하려면
//public 으로 공개한다.
class Score {

  // 다른 패키지에서 이 설계도에 따라 만든 변수에 접근할 수 있도록 하려면
  // 접근 범위를 public으로 공개해야 한다.
  String name;
  int kor;
  int eng;
  int math;
  int sum;
  float aver;

  // 다른 패키지에서 메서드를 사용할 수 있도록 하려면 public으로 공개해야 한다.
  void compute() {
    this.sum = this.kor + this.eng + this.math;
    this.aver = (float) this.sum / 3;
  }
}