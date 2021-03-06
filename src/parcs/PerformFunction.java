package parcs;

/**
 * Функция производительности. Расчитывает общую производительности хоста по
 * отдельным параметрам (производительность процессора, время отклика). Для
 * использования собственной функции производительности при распределении точек
 * по машинам отдельная задача может реализовать интерфейс PerformFunction
 * (метод function) и указать эту реализацию методом
 * task.setPerfFunc(PerformFunction)
 */
public interface PerformFunction {
    /**
     * большее значение функции соответствует большей производительности
     *
     * @param perf производительность процессора от 0 до 1, больше-лучше
     * @param ping пинг (время отклика) от 0 до 1, меньше-лучше
     * @return результирующая производительность
     */
    double function(double perf, double ping);
}
