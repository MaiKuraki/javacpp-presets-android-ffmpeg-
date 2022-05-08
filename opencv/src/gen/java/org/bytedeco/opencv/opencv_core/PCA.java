// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


/** \brief Principal Component Analysis
<p>
The class is used to calculate a special basis for a set of vectors. The
basis will consist of eigenvectors of the covariance matrix calculated
from the input set of vectors. The class %PCA can also transform
vectors to/from the new coordinate space defined by the basis. Usually,
in this new coordinate system, each vector from the original set (and
any linear combination of such vectors) can be quite accurately
approximated by taking its first few components, corresponding to the
eigenvectors of the largest eigenvalues of the covariance matrix.
Geometrically it means that you calculate a projection of the vector to
a subspace formed by a few eigenvectors corresponding to the dominant
eigenvalues of the covariance matrix. And usually such a projection is
very close to the original vector. So, you can represent the original
vector from a high-dimensional space with a much shorter vector
consisting of the projected vector's coordinates in the subspace. Such a
transformation is also known as Karhunen-Loeve Transform, or KLT.
See http://en.wikipedia.org/wiki/Principal_component_analysis
<p>
The sample below is the function that takes two matrices. The first
function stores a set of vectors (a row per vector) that is used to
calculate PCA. The second function stores another "test" set of vectors
(a row per vector). First, these vectors are compressed with PCA, then
reconstructed back, and then the reconstruction error norm is computed
and printed for each vector. :
<p>
<pre>{@code {.cpp}
using namespace cv;

PCA compressPCA(const Mat& pcaset, int maxComponents,
                const Mat& testset, Mat& compressed)
{
    PCA pca(pcaset, // pass the data
            Mat(), // we do not have a pre-computed mean vector,
                   // so let the PCA engine to compute it
            PCA::DATA_AS_ROW, // indicate that the vectors
                                // are stored as matrix rows
                                // (use PCA::DATA_AS_COL if the vectors are
                                // the matrix columns)
            maxComponents // specify, how many principal components to retain
            );
    // if there is no test data, just return the computed basis, ready-to-use
    if( !testset.data )
        return pca;
    CV_Assert( testset.cols == pcaset.cols );

    compressed.create(testset.rows, maxComponents, testset.type());

    Mat reconstructed;
    for( int i = 0; i < testset.rows; i++ )
    {
        Mat vec = testset.row(i), coeffs = compressed.row(i), reconstructed;
        // compress the vector, the result will be stored
        // in the i-th row of the output matrix
        pca.project(vec, coeffs);
        // and then reconstruct it
        pca.backProject(coeffs, reconstructed);
        // and measure the error
        printf("%d. diff = %g\n", i, norm(vec, reconstructed, NORM_L2));
    }
    return pca;
}
}</pre>
@see calcCovarMatrix, mulTransposed, SVD, dft, dct
*/
@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class PCA extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PCA(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PCA(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public PCA position(long position) {
        return (PCA)super.position(position);
    }
    @Override public PCA getPointer(long i) {
        return new PCA((Pointer)this).offsetAddress(i);
    }

    /** enum cv::PCA::Flags */
    public static final int /** indicates that the input samples are stored as matrix rows */
 DATA_AS_ROW = 0,
                 /** indicates that the input samples are stored as matrix columns */
                 DATA_AS_COL = 1,
                 //!
                 USE_AVG     = 2;  /** */

    /** \brief default constructor
    <p>
    The default constructor initializes an empty %PCA structure. The other
    constructors initialize the structure and call PCA::operator()().
    */
    public PCA() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** \overload
    @param data input samples stored as matrix rows or matrix columns.
    @param mean optional mean value; if the matrix is empty (\c noArray()),
    the mean is computed from the data.
    @param flags operation flags; currently the parameter is only used to
    specify the data layout (PCA::Flags)
    @param maxComponents maximum number of components that %PCA should
    retain; by default, all the components are retained.
    */
    public PCA(@ByVal Mat data, @ByVal Mat mean, int flags, int maxComponents/*=0*/) { super((Pointer)null); allocate(data, mean, flags, maxComponents); }
    private native void allocate(@ByVal Mat data, @ByVal Mat mean, int flags, int maxComponents/*=0*/);
    public PCA(@ByVal Mat data, @ByVal Mat mean, int flags) { super((Pointer)null); allocate(data, mean, flags); }
    private native void allocate(@ByVal Mat data, @ByVal Mat mean, int flags);
    public PCA(@ByVal UMat data, @ByVal UMat mean, int flags, int maxComponents/*=0*/) { super((Pointer)null); allocate(data, mean, flags, maxComponents); }
    private native void allocate(@ByVal UMat data, @ByVal UMat mean, int flags, int maxComponents/*=0*/);
    public PCA(@ByVal UMat data, @ByVal UMat mean, int flags) { super((Pointer)null); allocate(data, mean, flags); }
    private native void allocate(@ByVal UMat data, @ByVal UMat mean, int flags);
    public PCA(@ByVal GpuMat data, @ByVal GpuMat mean, int flags, int maxComponents/*=0*/) { super((Pointer)null); allocate(data, mean, flags, maxComponents); }
    private native void allocate(@ByVal GpuMat data, @ByVal GpuMat mean, int flags, int maxComponents/*=0*/);
    public PCA(@ByVal GpuMat data, @ByVal GpuMat mean, int flags) { super((Pointer)null); allocate(data, mean, flags); }
    private native void allocate(@ByVal GpuMat data, @ByVal GpuMat mean, int flags);

    /** \overload
    @param data input samples stored as matrix rows or matrix columns.
    @param mean optional mean value; if the matrix is empty (noArray()),
    the mean is computed from the data.
    @param flags operation flags; currently the parameter is only used to
    specify the data layout (PCA::Flags)
    @param retainedVariance Percentage of variance that PCA should retain.
    Using this parameter will let the PCA decided how many components to
    retain but it will always keep at least 2.
    */
    public PCA(@ByVal Mat data, @ByVal Mat mean, int flags, double retainedVariance) { super((Pointer)null); allocate(data, mean, flags, retainedVariance); }
    private native void allocate(@ByVal Mat data, @ByVal Mat mean, int flags, double retainedVariance);
    public PCA(@ByVal UMat data, @ByVal UMat mean, int flags, double retainedVariance) { super((Pointer)null); allocate(data, mean, flags, retainedVariance); }
    private native void allocate(@ByVal UMat data, @ByVal UMat mean, int flags, double retainedVariance);
    public PCA(@ByVal GpuMat data, @ByVal GpuMat mean, int flags, double retainedVariance) { super((Pointer)null); allocate(data, mean, flags, retainedVariance); }
    private native void allocate(@ByVal GpuMat data, @ByVal GpuMat mean, int flags, double retainedVariance);

    /** \brief performs %PCA
    <p>
    The operator performs %PCA of the supplied dataset. It is safe to reuse
    the same PCA structure for multiple datasets. That is, if the structure
    has been previously used with another dataset, the existing internal
    data is reclaimed and the new \ref eigenvalues, \ref eigenvectors and \ref
    mean are allocated and computed.
    <p>
    The computed \ref eigenvalues are sorted from the largest to the smallest and
    the corresponding \ref eigenvectors are stored as eigenvectors rows.
    <p>
    @param data input samples stored as the matrix rows or as the matrix
    columns.
    @param mean optional mean value; if the matrix is empty (noArray()),
    the mean is computed from the data.
    @param flags operation flags; currently the parameter is only used to
    specify the data layout. (Flags)
    @param maxComponents maximum number of components that PCA should
    retain; by default, all the components are retained.
    */
    public native @ByRef @Name("operator ()") PCA apply(@ByVal Mat data, @ByVal Mat mean, int flags, int maxComponents/*=0*/);
    public native @ByRef @Name("operator ()") PCA apply(@ByVal Mat data, @ByVal Mat mean, int flags);
    public native @ByRef @Name("operator ()") PCA apply(@ByVal UMat data, @ByVal UMat mean, int flags, int maxComponents/*=0*/);
    public native @ByRef @Name("operator ()") PCA apply(@ByVal UMat data, @ByVal UMat mean, int flags);
    public native @ByRef @Name("operator ()") PCA apply(@ByVal GpuMat data, @ByVal GpuMat mean, int flags, int maxComponents/*=0*/);
    public native @ByRef @Name("operator ()") PCA apply(@ByVal GpuMat data, @ByVal GpuMat mean, int flags);

    /** \overload
    @param data input samples stored as the matrix rows or as the matrix
    columns.
    @param mean optional mean value; if the matrix is empty (noArray()),
    the mean is computed from the data.
    @param flags operation flags; currently the parameter is only used to
    specify the data layout. (PCA::Flags)
    @param retainedVariance Percentage of variance that %PCA should retain.
    Using this parameter will let the %PCA decided how many components to
    retain but it will always keep at least 2.
     */
    public native @ByRef @Name("operator ()") PCA apply(@ByVal Mat data, @ByVal Mat mean, int flags, double retainedVariance);
    public native @ByRef @Name("operator ()") PCA apply(@ByVal UMat data, @ByVal UMat mean, int flags, double retainedVariance);
    public native @ByRef @Name("operator ()") PCA apply(@ByVal GpuMat data, @ByVal GpuMat mean, int flags, double retainedVariance);

    /** \brief Projects vector(s) to the principal component subspace.
    <p>
    The methods project one or more vectors to the principal component
    subspace, where each vector projection is represented by coefficients in
    the principal component basis. The first form of the method returns the
    matrix that the second form writes to the result. So the first form can
    be used as a part of expression while the second form can be more
    efficient in a processing loop.
    @param vec input vector(s); must have the same dimensionality and the
    same layout as the input data used at %PCA phase, that is, if
    DATA_AS_ROW are specified, then {@code vec.cols==data.cols}
    (vector dimensionality) and {@code vec.rows} is the number of vectors to
    project, and the same is true for the PCA::DATA_AS_COL case.
    */
    public native @ByVal Mat project(@ByVal Mat vec);
    public native @ByVal Mat project(@ByVal UMat vec);
    public native @ByVal Mat project(@ByVal GpuMat vec);

    /** \overload
    @param vec input vector(s); must have the same dimensionality and the
    same layout as the input data used at PCA phase, that is, if
    DATA_AS_ROW are specified, then {@code vec.cols==data.cols}
    (vector dimensionality) and {@code vec.rows} is the number of vectors to
    project, and the same is true for the PCA::DATA_AS_COL case.
    @param result output vectors; in case of PCA::DATA_AS_COL, the
    output matrix has as many columns as the number of input vectors, this
    means that {@code result.cols==vec.cols} and the number of rows match the
    number of principal components (for example, {@code maxComponents} parameter
    passed to the constructor).
     */
    public native void project(@ByVal Mat vec, @ByVal Mat result);
    public native void project(@ByVal UMat vec, @ByVal UMat result);
    public native void project(@ByVal GpuMat vec, @ByVal GpuMat result);

    /** \brief Reconstructs vectors from their PC projections.
    <p>
    The methods are inverse operations to PCA::project. They take PC
    coordinates of projected vectors and reconstruct the original vectors.
    Unless all the principal components have been retained, the
    reconstructed vectors are different from the originals. But typically,
    the difference is small if the number of components is large enough (but
    still much smaller than the original vector dimensionality). As a
    result, PCA is used.
    @param vec coordinates of the vectors in the principal component
    subspace, the layout and size are the same as of PCA::project output
    vectors.
     */
    public native @ByVal Mat backProject(@ByVal Mat vec);
    public native @ByVal Mat backProject(@ByVal UMat vec);
    public native @ByVal Mat backProject(@ByVal GpuMat vec);

    /** \overload
    @param vec coordinates of the vectors in the principal component
    subspace, the layout and size are the same as of PCA::project output
    vectors.
    @param result reconstructed vectors; the layout and size are the same as
    of PCA::project input vectors.
     */
    public native void backProject(@ByVal Mat vec, @ByVal Mat result);
    public native void backProject(@ByVal UMat vec, @ByVal UMat result);
    public native void backProject(@ByVal GpuMat vec, @ByVal GpuMat result);

    /** \brief write PCA objects
    <p>
    Writes \ref eigenvalues \ref eigenvectors and \ref mean to specified FileStorage
     */
    public native void write(@ByRef FileStorage fs);

    /** \brief load PCA objects
    <p>
    Loads \ref eigenvalues \ref eigenvectors and \ref mean from specified FileNode
     */
    public native void read(@Const @ByRef FileNode fn);

    /** eigenvectors of the covariation matrix */
    public native @ByRef Mat eigenvectors(); public native PCA eigenvectors(Mat setter);
    /** eigenvalues of the covariation matrix */
    public native @ByRef Mat eigenvalues(); public native PCA eigenvalues(Mat setter);
    /** mean value subtracted before the projection and added after the back projection */
    public native @ByRef Mat mean(); public native PCA mean(Mat setter);
}
