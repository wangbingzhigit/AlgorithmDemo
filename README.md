# AlgorithmDemo
二分查找改进方向：</br>
在数据类型是int类型的时候，用于查找中间位数的时候都会写做：</br>`int mid = (low+high)/2`</br>
当我们在查找数据的量非常之大的时候，如果使用`(low+high)`就会超出范围，而产生负数，从而导致了溢出的现象产生，所以为了避免产生负数，我们会修改代码为：</br>
`int mid = low+((high-low)/2)`
