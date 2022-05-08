// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_ml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;

import static org.bytedeco.opencv.global.opencv_ml.*;


/****************************************************************************************\
*                                      Decision Tree                                     *
\****************************************************************************************/

/** \brief The class represents a single decision tree or a collection of decision trees.
<p>
The current public interface of the class allows user to train only a single decision tree, however
the class is capable of storing multiple decision trees and using them for prediction (by summing
responses or using a voting schemes), and the derived from DTrees classes (such as RTrees and Boost)
use this capability to implement decision tree ensembles.
<p>
@see \ref ml_intro_trees
*/
@Namespace("cv::ml") @Properties(inherit = org.bytedeco.opencv.presets.opencv_ml.class)
public class DTrees extends StatModel {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DTrees(Pointer p) { super(p); }

    /** Predict options */
    /** enum cv::ml::DTrees::Flags */
    public static final int PREDICT_AUTO = 0, PREDICT_SUM = (1<<8), PREDICT_MAX_VOTE = (2<<8), PREDICT_MASK = (3<<8);

    /** Cluster possible values of a categorical variable into K\<=maxCategories clusters to
    find a suboptimal split.
    If a discrete variable, on which the training procedure tries to make a split, takes more than
    maxCategories values, the precise best subset estimation may take a very long time because the
    algorithm is exponential. Instead, many decision trees engines (including our implementation)
    try to find sub-optimal split in this case by clustering all the samples into maxCategories
    clusters that is some categories are merged together. The clustering is applied only in n \>
    2-class classification problems for categorical variables with N \> max_categories possible
    values. In case of regression and 2-class classification the optimal split can be found
    efficiently without employing clustering, thus the parameter is not used in these cases.
    Default value is 10.*/
    /** @see setMaxCategories */
    public native int getMaxCategories();
    /** \copybrief getMaxCategories @see getMaxCategories */
    public native void setMaxCategories(int val);

    /** The maximum possible depth of the tree.
    That is the training algorithms attempts to split a node while its depth is less than maxDepth.
    The root node has zero depth. The actual depth may be smaller if the other termination criteria
    are met (see the outline of the training procedure \ref ml_intro_trees "here"), and/or if the
    tree is pruned. Default value is INT_MAX.*/
    /** @see setMaxDepth */
    public native int getMaxDepth();
    /** \copybrief getMaxDepth @see getMaxDepth */
    public native void setMaxDepth(int val);

    /** If the number of samples in a node is less than this parameter then the node will not be split.
    <p>
    Default value is 10.*/
    /** @see setMinSampleCount */
    public native int getMinSampleCount();
    /** \copybrief getMinSampleCount @see getMinSampleCount */
    public native void setMinSampleCount(int val);

    /** If CVFolds \> 1 then algorithms prunes the built decision tree using K-fold
    cross-validation procedure where K is equal to CVFolds.
    Default value is 10.*/
    /** @see setCVFolds */
    public native int getCVFolds();
    /** \copybrief getCVFolds @see getCVFolds */
    public native void setCVFolds(int val);

    /** If true then surrogate splits will be built.
    These splits allow to work with missing data and compute variable importance correctly.
    Default value is false.
    \note currently it's not implemented.*/
    /** @see setUseSurrogates */
    public native @Cast("bool") boolean getUseSurrogates();
    /** \copybrief getUseSurrogates @see getUseSurrogates */
    public native void setUseSurrogates(@Cast("bool") boolean val);

    /** If true then a pruning will be harsher.
    This will make a tree more compact and more resistant to the training data noise but a bit less
    accurate. Default value is true.*/
    /** @see setUse1SERule */
    public native @Cast("bool") boolean getUse1SERule();
    /** \copybrief getUse1SERule @see getUse1SERule */
    public native void setUse1SERule(@Cast("bool") boolean val);

    /** If true then pruned branches are physically removed from the tree.
    Otherwise they are retained and it is possible to get results from the original unpruned (or
    pruned less aggressively) tree. Default value is true.*/
    /** @see setTruncatePrunedTree */
    public native @Cast("bool") boolean getTruncatePrunedTree();
    /** \copybrief getTruncatePrunedTree @see getTruncatePrunedTree */
    public native void setTruncatePrunedTree(@Cast("bool") boolean val);

    /** Termination criteria for regression trees.
    If all absolute differences between an estimated value in a node and values of train samples
    in this node are less than this parameter then the node will not be split further. Default
    value is 0.01f*/
    /** @see setRegressionAccuracy */
    public native float getRegressionAccuracy();
    /** \copybrief getRegressionAccuracy @see getRegressionAccuracy */
    public native void setRegressionAccuracy(float val);

    /** \brief The array of a priori class probabilities, sorted by the class label value.
    <p>
    The parameter can be used to tune the decision tree preferences toward a certain class. For
    example, if you want to detect some rare anomaly occurrence, the training base will likely
    contain much more normal cases than anomalies, so a very good classification performance
    will be achieved just by considering every case as normal. To avoid this, the priors can be
    specified, where the anomaly probability is artificially increased (up to 0.5 or even
    greater), so the weight of the misclassified anomalies becomes much bigger, and the tree is
    adjusted properly.
    <p>
    You can also think about this parameter as weights of prediction categories which determine
    relative weights that you give to misclassification. That is, if the weight of the first
    category is 1 and the weight of the second category is 10, then each mistake in predicting
    the second category is equivalent to making 10 mistakes in predicting the first category.
    Default value is empty Mat.*/
    /** @see setPriors */
    public native @ByVal Mat getPriors();
    /** \copybrief getPriors @see getPriors */
    public native void setPriors(@Const @ByRef Mat val);

    /** \brief The class represents a decision tree node.
     */
    @NoOffset public static class Node extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Node(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public Node(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public Node position(long position) {
            return (Node)super.position(position);
        }
        @Override public Node getPointer(long i) {
            return new Node((Pointer)this).offsetAddress(i);
        }
    
        public Node() { super((Pointer)null); allocate(); }
        private native void allocate();
        /** Value at the node: a class label in case of classification or estimated
         *  function value in case of regression. */
        public native double value(); public native Node value(double setter);
        /** Class index normalized to 0..class_count-1 range and assigned to the
         *  node. It is used internally in classification trees and tree ensembles. */
        public native int classIdx(); public native Node classIdx(int setter);
        /** Index of the parent node */
        public native int parent(); public native Node parent(int setter);
        /** Index of the left child node */
        public native int left(); public native Node left(int setter);
        /** Index of right child node */
        public native int right(); public native Node right(int setter);
        /** Default direction where to go (-1: left or +1: right). It helps in the
         *  case of missing values. */
        public native int defaultDir(); public native Node defaultDir(int setter);
        /** Index of the first split */
        public native int split(); public native Node split(int setter);
    }

    /** \brief The class represents split in a decision tree.
     */
    @NoOffset public static class Split extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Split(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public Split(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public Split position(long position) {
            return (Split)super.position(position);
        }
        @Override public Split getPointer(long i) {
            return new Split((Pointer)this).offsetAddress(i);
        }
    
        public Split() { super((Pointer)null); allocate(); }
        private native void allocate();
        /** Index of variable on which the split is created. */
        public native int varIdx(); public native Split varIdx(int setter);
        /** If true, then the inverse split rule is used (i.e. left and right
         *  branches are exchanged in the rule expressions below). */
        public native @Cast("bool") boolean inversed(); public native Split inversed(boolean setter);
        /** The split quality, a positive number. It is used to choose the best split. */
        public native float quality(); public native Split quality(float setter);
        /** Index of the next split in the list of splits for the node */
        public native int next(); public native Split next(int setter);
        /** The threshold value in case of split on an ordered variable.
                              The rule is:
                              <pre>{@code {.none}
                              if var_value < c
                                then next_node <- left
                                else next_node <- right
                              }</pre> */
        public native float c(); public native Split c(float setter);
        /** Offset of the bitset used by the split on a categorical variable.
                                    The rule is:
                                    <pre>{@code {.none}
                                    if bitset[var_value] == 1
                                        then next_node <- left
                                        else next_node <- right
                                    }</pre> */
        public native int subsetOfs(); public native Split subsetOfs(int setter);
    }

    /** \brief Returns indices of root nodes
    */
    public native @StdVector IntPointer getRoots();
    /** \brief Returns all the nodes
    <p>
    all the node indices are indices in the returned vector
     */
    public native @StdVector Node getNodes();
    /** \brief Returns all the splits
    <p>
    all the split indices are indices in the returned vector
     */
    public native @StdVector Split getSplits();
    /** \brief Returns all the bitsets for categorical splits
    <p>
    Split::subsetOfs is an offset in the returned vector
     */
    public native @StdVector IntPointer getSubsets();

    /** \brief Creates the empty model
    <p>
    The static method creates empty decision tree with the specified parameters. It should be then
    trained using train method (see StatModel::train). Alternatively, you can load the model from
    file using Algorithm::load\<DTrees\>(filename).
     */
    public static native @Ptr DTrees create();

    /** \brief Loads and creates a serialized DTrees from a file
     *
     * Use DTree::save to serialize and store an DTree to disk.
     * Load the DTree from this file again, by calling this function with the path to the file.
     * Optionally specify the node for the file containing the classifier
     *
     * @param filepath path to serialized DTree
     * @param nodeName name of node containing the classifier
     */
    public static native @Ptr DTrees load(@Str BytePointer filepath, @Str BytePointer nodeName/*=cv::String()*/);
    public static native @Ptr DTrees load(@Str BytePointer filepath);
    public static native @Ptr DTrees load(@Str String filepath, @Str String nodeName/*=cv::String()*/);
    public static native @Ptr DTrees load(@Str String filepath);
}
