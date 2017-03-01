 class Ant {

private final static int step = 1;

private int position;

private int direction = 1;
/*
* �˺�������һ�Σ���ʾ����ǰ��һ����λʱ�䣬����Ѿ�����ľ������׳��쳣
*/
public void walk() {
if (isOut()) {
throw new RuntimeException("the ant is out");
}
position = position + this.direction * step;
};
/**
* ��������Ƿ��Ѿ��߳�ľ�ˣ�����߳�����true
*
*/
public boolean isOut() {
return position <= 0 || position >= 27;
}
/**
* ���������Ƿ��Ѿ���������һֻ����
* @param ant
* @return �����������true
*/
public boolean isEncounter(Ant ant) {
return ant.position == this.position;
}
/**
* �ı����ϵ�ǰ������
*/
public void changeDistation() {
direction = -1 * direction;
}
/**
* ���캯��,�������ϵĳ�ʼǰ������,�ͳ�ʼλ��
* @param position
* @param direction
*/
public Ant(int position, int direction) {
this.position = position;
if (direction != 1) {
this.direction = -1;//�������ó�ʼλ��,����Ϊ0ʱ,Ҳ��������Ϊ1.�������Է������Ĵ���
} else {
this.direction = 1;
}
}
}
/////////////////////////////////////////////////////////

 class Controller {
public static void main(String[] args) {
int time = 0;
for (int i = 0; i < 32; i++) {
Ant[] antArray = getAntList(getPoistions(), getDirections(i));
while (!isAllOut(antArray)) {
for (Ant ant : antArray) {
     if (!ant.isOut()) {
    ant.walk();
     }
}
time++;
// �鿴�Ƿ����Ѿ�������Ant,������������ǰ������
dealEncounter(antArray);
}
System.out.println(time);
// ��ʱ���0,��������������������,�ٴεõ�ȫ����������Ҫ��ʱ��.
time = 0;
}
}
/**
* ����������㷨���ң�����ʱ�ܽ������
* 
* @param list
*/
public static void dealEncounter(Ant[] antArray) {
int num_ant = antArray.length;
for (int j = 0; j < num_ant; j++) {
for (int k = j + 1; k < num_ant; k++) {
if (antArray[j].isEncounter(antArray[k])) {
     antArray[j].changeDistation();
     antArray[k].changeDistation();
}
}
}
}
/**
* ��Ϊ��5ֻAnt���������֮����32�����.�պ���5λ����������ʾ,���Ϊ0���ʾAnt��0�ķ����� ���Ϊ1,���ʾ��27�ķ�����
* 
* ע:��ͨ��Ant�Ĺ��캯�����ó�ʼֵʱ,ͨ�����˰�0�޸ĳ���-1.
*/
public static int[] getDirections(int seed) {
int result[] = new int[5];
result[0] = seed % 2;
result[1] = seed / 2 % 2;
result[2] = seed / 4 % 2;
result[3] = seed / 8 % 2;
result[4] = seed / 16 % 2;
System.out.println("directions is " + result[0] + "|" + result[1] + "|"
+ result[2] + "|" + result[3] + "|" + result[4]);
return result;
}
/**
* ��������Ant�ĳ�ʼλ��,�������ò���ʮ�ֱ�Ҫ,����ֱ���ڴ���������
* 
* @return
*/
public static int[] getPoistions() {
return new int[] { 3, 7, 11, 17, 23 };
}
/**
* ȡ�����úó�ʼֵ��5ֻAnt
* 
* @param positions
* @param directions
* @return
*/
public static Ant[] getAntList(int[] positions, int[] directions) {
Ant ant3 = new Ant(positions[0], directions[0]);
Ant ant7 = new Ant(positions[1], directions[1]);
Ant ant11 = new Ant(positions[2], directions[2]);
Ant ant17 = new Ant(positions[3], directions[3]);
Ant ant23 = new Ant(positions[4], directions[4]);
return new Ant[] { ant3, ant7, ant11, ant17, ant23 };
}
/**
* �ж��Ƿ����е�Ant���Ѿ��߳���ľ��,Ҳ���������˳�����
* 
* @param antArray
* @return
*/
public static boolean isAllOut(Ant[] antArray) {
for (Ant ant : antArray) {
if (ant.isOut() == false) {
return false;
}
}
return true;
}
}
