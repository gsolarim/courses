main(){
  // === Números ===
  var a = 10;
  dynamic b = 20;
  print(a);
  print(b);
  
  // entero o double
  int c = 30;
  double d = 5.5;
  print(c);
  print(d);
  
  // nulos
  int? e;
  print(e);

  // nomenclaturas permitidas
  int _a = 30;
  double $b = 40;  
  print(_a + $b);
  double resultado = _a + $b;
  print(resultado);
}