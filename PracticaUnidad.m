frecuencia_m = 1000;   %frecuencia de muestreo
s = 1;               %tiempo de frecuencia
periodo=input('introduzca el periodo \n');
amplitud=input('introduzca la amplitud \n');
tasa_bits=input('introduzca la tasa de bits de bits \n');
hz= 1/periodo;               %frecuencia de la onda //valor a cambiar
t=(0:1/frecuencia_m:s);

figure('Position',[200,300,1000,300]);

sen= sin(2*pi*hz*t)*amplitud; %onda analogica
subplot(1,2,1)
plot(t,sen,'r','LineWidth',2)
axis([0 s (-1*amplitud)-1 amplitud+1])
xlabel('Tiempo(seg)')
ylabel('Amplitud')
title(hz+" periodos en 1 seg"+ ' \rightarrow ' + "frecuencia = "+hz+" Hz")


sq=square(pi*tasa_bits*t)/2+1/2; %onda digital
subplot(1,2,2); 
plot(t,sq,'LineWidth',2.5)
axis([0 s -0.1 1.1])
xlabel('Tiempo(seg)')
ylabel('Amplitud')
title("1 seg = "+ tasa_bits+" intervalos de bit"+'\rightarrow' +"Taza de bits: "+tasa_bits+" bps");