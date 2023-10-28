import com.zemise_03.MyService;
import com.zemise_03.impl.zemise;

module MyOne {
    exports com.zemise_01;
    exports com.zemise_03;

    provides MyService with zemise;
}