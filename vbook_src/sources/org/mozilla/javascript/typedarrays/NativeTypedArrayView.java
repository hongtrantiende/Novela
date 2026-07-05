package org.mozilla.javascript.typedarrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.RandomAccess;
import java.util.function.Function;
import org.mozilla.javascript.AbstractEcmaObjectOperations;
import org.mozilla.javascript.ArrayLikeAbstractOperations;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ExternalArrayData;
import org.mozilla.javascript.LambdaConstructor;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeArrayIterator;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.SymbolKey;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.Wrapper;
import org.mozilla.javascript.typedarrays.NativeTypedArrayView;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public abstract class NativeTypedArrayView<T> extends NativeArrayBufferView implements List<T>, RandomAccess, ExternalArrayData {
    private static final long serialVersionUID = -4963053773152251274L;
    protected final int length;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public interface RealThis {
        NativeTypedArrayView<?> realThis(Scriptable scriptable);
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public interface TypedArrayConstructable {
        NativeTypedArrayView<?> construct(NativeArrayBuffer nativeArrayBuffer, int i, int i2);
    }

    public NativeTypedArrayView() {
        this.length = 0;
    }

    private Object getElemForToString(Context context, Scriptable scriptable, int i, boolean z) {
        Object js_get = js_get(i);
        if (z) {
            return ScriptRuntime.getPropFunctionAndThis(js_get, "toLocaleString", context, scriptable).call(context, scriptable, ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.emptyArgs);
        }
        return js_get;
    }

    public static void init(Context context, Scriptable scriptable, LambdaConstructor lambdaConstructor, final RealThis realThis) {
        lambdaConstructor.definePrototypeProperty(context, "buffer", new Function() { // from class: sy7
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object lambda$init$1;
                Object lambda$init$0;
                Object lambda$init$2;
                Object lambda$init$3;
                int i = r2;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                Scriptable scriptable2 = (Scriptable) obj;
                switch (i) {
                    case 0:
                        lambda$init$1 = NativeTypedArrayView.lambda$init$1(realThis2, scriptable2);
                        return lambda$init$1;
                    case 1:
                        lambda$init$0 = NativeTypedArrayView.lambda$init$0(realThis2, scriptable2);
                        return lambda$init$0;
                    case 2:
                        lambda$init$2 = NativeTypedArrayView.lambda$init$2(realThis2, scriptable2);
                        return lambda$init$2;
                    default:
                        lambda$init$3 = NativeTypedArrayView.lambda$init$3(realThis2, scriptable2);
                        return lambda$init$3;
                }
            }
        }, 3);
        lambdaConstructor.definePrototypeProperty(context, "byteLength", new Function() { // from class: sy7
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object lambda$init$1;
                Object lambda$init$0;
                Object lambda$init$2;
                Object lambda$init$3;
                int i = r2;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                Scriptable scriptable2 = (Scriptable) obj;
                switch (i) {
                    case 0:
                        lambda$init$1 = NativeTypedArrayView.lambda$init$1(realThis2, scriptable2);
                        return lambda$init$1;
                    case 1:
                        lambda$init$0 = NativeTypedArrayView.lambda$init$0(realThis2, scriptable2);
                        return lambda$init$0;
                    case 2:
                        lambda$init$2 = NativeTypedArrayView.lambda$init$2(realThis2, scriptable2);
                        return lambda$init$2;
                    default:
                        lambda$init$3 = NativeTypedArrayView.lambda$init$3(realThis2, scriptable2);
                        return lambda$init$3;
                }
            }
        }, 3);
        lambdaConstructor.definePrototypeProperty(context, "byteOffset", new Function() { // from class: sy7
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object lambda$init$1;
                Object lambda$init$0;
                Object lambda$init$2;
                Object lambda$init$3;
                int i = r2;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                Scriptable scriptable2 = (Scriptable) obj;
                switch (i) {
                    case 0:
                        lambda$init$1 = NativeTypedArrayView.lambda$init$1(realThis2, scriptable2);
                        return lambda$init$1;
                    case 1:
                        lambda$init$0 = NativeTypedArrayView.lambda$init$0(realThis2, scriptable2);
                        return lambda$init$0;
                    case 2:
                        lambda$init$2 = NativeTypedArrayView.lambda$init$2(realThis2, scriptable2);
                        return lambda$init$2;
                    default:
                        lambda$init$3 = NativeTypedArrayView.lambda$init$3(realThis2, scriptable2);
                        return lambda$init$3;
                }
            }
        }, 3);
        lambdaConstructor.definePrototypeProperty(context, "length", new Function() { // from class: sy7
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object lambda$init$1;
                Object lambda$init$0;
                Object lambda$init$2;
                Object lambda$init$3;
                int i = r2;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                Scriptable scriptable2 = (Scriptable) obj;
                switch (i) {
                    case 0:
                        lambda$init$1 = NativeTypedArrayView.lambda$init$1(realThis2, scriptable2);
                        return lambda$init$1;
                    case 1:
                        lambda$init$0 = NativeTypedArrayView.lambda$init$0(realThis2, scriptable2);
                        return lambda$init$0;
                    case 2:
                        lambda$init$2 = NativeTypedArrayView.lambda$init$2(realThis2, scriptable2);
                        return lambda$init$2;
                    default:
                        lambda$init$3 = NativeTypedArrayView.lambda$init$3(realThis2, scriptable2);
                        return lambda$init$3;
                }
            }
        }, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "at", 1, new Callable() { // from class: ry7
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object lambda$init$18;
                Object lambda$init$19;
                Object lambda$init$20;
                Object lambda$init$21;
                Object lambda$init$22;
                Object lambda$init$23;
                Object lambda$init$24;
                Object lambda$init$25;
                Object lambda$init$26;
                Object lambda$init$27;
                Object lambda$init$28;
                Object lambda$init$29;
                Object lambda$init$30;
                Object lambda$init$31;
                Object lambda$init$32;
                Object lambda$init$33;
                Object lambda$init$34;
                Object lambda$init$35;
                Object lambda$init$10;
                Object lambda$init$4;
                Object lambda$init$5;
                Object lambda$init$6;
                Object lambda$init$7;
                Object lambda$init$8;
                Object lambda$init$9;
                Object lambda$init$11;
                Object lambda$init$12;
                Object lambda$init$13;
                Object lambda$init$14;
                Object lambda$init$15;
                int i = r2;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i) {
                    case 0:
                        lambda$init$18 = NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$18;
                    case 1:
                        lambda$init$19 = NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$19;
                    case 2:
                        lambda$init$20 = NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$20;
                    case 3:
                        lambda$init$21 = NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$21;
                    case 4:
                        lambda$init$22 = NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$22;
                    case 5:
                        lambda$init$23 = NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$23;
                    case 6:
                        lambda$init$24 = NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$24;
                    case 7:
                        lambda$init$25 = NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$25;
                    case 8:
                        lambda$init$26 = NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$26;
                    case 9:
                        lambda$init$27 = NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$27;
                    case 10:
                        lambda$init$28 = NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$28;
                    case 11:
                        lambda$init$29 = NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$29;
                    case 12:
                        lambda$init$30 = NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$30;
                    case 13:
                        lambda$init$31 = NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$31;
                    case 14:
                        lambda$init$32 = NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$32;
                    case 15:
                        lambda$init$33 = NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$33;
                    case 16:
                        lambda$init$34 = NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$34;
                    case 17:
                        lambda$init$35 = NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$35;
                    case 18:
                        lambda$init$10 = NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$10;
                    case 19:
                        lambda$init$4 = NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$4;
                    case 20:
                        lambda$init$5 = NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$5;
                    case 21:
                        lambda$init$6 = NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$6;
                    case 22:
                        lambda$init$7 = NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$7;
                    case 23:
                        lambda$init$8 = NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$8;
                    case 24:
                        lambda$init$9 = NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$9;
                    case 25:
                        lambda$init$11 = NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$11;
                    case 26:
                        lambda$init$12 = NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$12;
                    case 27:
                        lambda$init$13 = NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$13;
                    case 28:
                        lambda$init$14 = NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$14;
                    default:
                        lambda$init$15 = NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$15;
                }
            }
        }, 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "copyWithin", 1, new Callable() { // from class: ry7
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object lambda$init$18;
                Object lambda$init$19;
                Object lambda$init$20;
                Object lambda$init$21;
                Object lambda$init$22;
                Object lambda$init$23;
                Object lambda$init$24;
                Object lambda$init$25;
                Object lambda$init$26;
                Object lambda$init$27;
                Object lambda$init$28;
                Object lambda$init$29;
                Object lambda$init$30;
                Object lambda$init$31;
                Object lambda$init$32;
                Object lambda$init$33;
                Object lambda$init$34;
                Object lambda$init$35;
                Object lambda$init$10;
                Object lambda$init$4;
                Object lambda$init$5;
                Object lambda$init$6;
                Object lambda$init$7;
                Object lambda$init$8;
                Object lambda$init$9;
                Object lambda$init$11;
                Object lambda$init$12;
                Object lambda$init$13;
                Object lambda$init$14;
                Object lambda$init$15;
                int i = r2;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i) {
                    case 0:
                        lambda$init$18 = NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$18;
                    case 1:
                        lambda$init$19 = NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$19;
                    case 2:
                        lambda$init$20 = NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$20;
                    case 3:
                        lambda$init$21 = NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$21;
                    case 4:
                        lambda$init$22 = NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$22;
                    case 5:
                        lambda$init$23 = NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$23;
                    case 6:
                        lambda$init$24 = NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$24;
                    case 7:
                        lambda$init$25 = NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$25;
                    case 8:
                        lambda$init$26 = NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$26;
                    case 9:
                        lambda$init$27 = NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$27;
                    case 10:
                        lambda$init$28 = NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$28;
                    case 11:
                        lambda$init$29 = NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$29;
                    case 12:
                        lambda$init$30 = NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$30;
                    case 13:
                        lambda$init$31 = NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$31;
                    case 14:
                        lambda$init$32 = NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$32;
                    case 15:
                        lambda$init$33 = NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$33;
                    case 16:
                        lambda$init$34 = NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$34;
                    case 17:
                        lambda$init$35 = NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$35;
                    case 18:
                        lambda$init$10 = NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$10;
                    case 19:
                        lambda$init$4 = NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$4;
                    case 20:
                        lambda$init$5 = NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$5;
                    case 21:
                        lambda$init$6 = NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$6;
                    case 22:
                        lambda$init$7 = NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$7;
                    case 23:
                        lambda$init$8 = NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$8;
                    case 24:
                        lambda$init$9 = NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$9;
                    case 25:
                        lambda$init$11 = NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$11;
                    case 26:
                        lambda$init$12 = NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$12;
                    case 27:
                        lambda$init$13 = NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$13;
                    case 28:
                        lambda$init$14 = NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$14;
                    default:
                        lambda$init$15 = NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$15;
                }
            }
        }, 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "entries", 0, new Callable() { // from class: ry7
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object lambda$init$18;
                Object lambda$init$19;
                Object lambda$init$20;
                Object lambda$init$21;
                Object lambda$init$22;
                Object lambda$init$23;
                Object lambda$init$24;
                Object lambda$init$25;
                Object lambda$init$26;
                Object lambda$init$27;
                Object lambda$init$28;
                Object lambda$init$29;
                Object lambda$init$30;
                Object lambda$init$31;
                Object lambda$init$32;
                Object lambda$init$33;
                Object lambda$init$34;
                Object lambda$init$35;
                Object lambda$init$10;
                Object lambda$init$4;
                Object lambda$init$5;
                Object lambda$init$6;
                Object lambda$init$7;
                Object lambda$init$8;
                Object lambda$init$9;
                Object lambda$init$11;
                Object lambda$init$12;
                Object lambda$init$13;
                Object lambda$init$14;
                Object lambda$init$15;
                int i = r2;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i) {
                    case 0:
                        lambda$init$18 = NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$18;
                    case 1:
                        lambda$init$19 = NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$19;
                    case 2:
                        lambda$init$20 = NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$20;
                    case 3:
                        lambda$init$21 = NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$21;
                    case 4:
                        lambda$init$22 = NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$22;
                    case 5:
                        lambda$init$23 = NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$23;
                    case 6:
                        lambda$init$24 = NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$24;
                    case 7:
                        lambda$init$25 = NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$25;
                    case 8:
                        lambda$init$26 = NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$26;
                    case 9:
                        lambda$init$27 = NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$27;
                    case 10:
                        lambda$init$28 = NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$28;
                    case 11:
                        lambda$init$29 = NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$29;
                    case 12:
                        lambda$init$30 = NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$30;
                    case 13:
                        lambda$init$31 = NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$31;
                    case 14:
                        lambda$init$32 = NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$32;
                    case 15:
                        lambda$init$33 = NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$33;
                    case 16:
                        lambda$init$34 = NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$34;
                    case 17:
                        lambda$init$35 = NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$35;
                    case 18:
                        lambda$init$10 = NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$10;
                    case 19:
                        lambda$init$4 = NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$4;
                    case 20:
                        lambda$init$5 = NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$5;
                    case 21:
                        lambda$init$6 = NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$6;
                    case 22:
                        lambda$init$7 = NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$7;
                    case 23:
                        lambda$init$8 = NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$8;
                    case 24:
                        lambda$init$9 = NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$9;
                    case 25:
                        lambda$init$11 = NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$11;
                    case 26:
                        lambda$init$12 = NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$12;
                    case 27:
                        lambda$init$13 = NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$13;
                    case 28:
                        lambda$init$14 = NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$14;
                    default:
                        lambda$init$15 = NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$15;
                }
            }
        }, 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "every", 1, new Callable() { // from class: ry7
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object lambda$init$18;
                Object lambda$init$19;
                Object lambda$init$20;
                Object lambda$init$21;
                Object lambda$init$22;
                Object lambda$init$23;
                Object lambda$init$24;
                Object lambda$init$25;
                Object lambda$init$26;
                Object lambda$init$27;
                Object lambda$init$28;
                Object lambda$init$29;
                Object lambda$init$30;
                Object lambda$init$31;
                Object lambda$init$32;
                Object lambda$init$33;
                Object lambda$init$34;
                Object lambda$init$35;
                Object lambda$init$10;
                Object lambda$init$4;
                Object lambda$init$5;
                Object lambda$init$6;
                Object lambda$init$7;
                Object lambda$init$8;
                Object lambda$init$9;
                Object lambda$init$11;
                Object lambda$init$12;
                Object lambda$init$13;
                Object lambda$init$14;
                Object lambda$init$15;
                int i = r2;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i) {
                    case 0:
                        lambda$init$18 = NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$18;
                    case 1:
                        lambda$init$19 = NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$19;
                    case 2:
                        lambda$init$20 = NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$20;
                    case 3:
                        lambda$init$21 = NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$21;
                    case 4:
                        lambda$init$22 = NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$22;
                    case 5:
                        lambda$init$23 = NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$23;
                    case 6:
                        lambda$init$24 = NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$24;
                    case 7:
                        lambda$init$25 = NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$25;
                    case 8:
                        lambda$init$26 = NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$26;
                    case 9:
                        lambda$init$27 = NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$27;
                    case 10:
                        lambda$init$28 = NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$28;
                    case 11:
                        lambda$init$29 = NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$29;
                    case 12:
                        lambda$init$30 = NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$30;
                    case 13:
                        lambda$init$31 = NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$31;
                    case 14:
                        lambda$init$32 = NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$32;
                    case 15:
                        lambda$init$33 = NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$33;
                    case 16:
                        lambda$init$34 = NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$34;
                    case 17:
                        lambda$init$35 = NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$35;
                    case 18:
                        lambda$init$10 = NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$10;
                    case 19:
                        lambda$init$4 = NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$4;
                    case 20:
                        lambda$init$5 = NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$5;
                    case 21:
                        lambda$init$6 = NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$6;
                    case 22:
                        lambda$init$7 = NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$7;
                    case 23:
                        lambda$init$8 = NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$8;
                    case 24:
                        lambda$init$9 = NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$9;
                    case 25:
                        lambda$init$11 = NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$11;
                    case 26:
                        lambda$init$12 = NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$12;
                    case 27:
                        lambda$init$13 = NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$13;
                    case 28:
                        lambda$init$14 = NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$14;
                    default:
                        lambda$init$15 = NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$15;
                }
            }
        }, 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "fill", 1, new Callable() { // from class: ry7
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object lambda$init$18;
                Object lambda$init$19;
                Object lambda$init$20;
                Object lambda$init$21;
                Object lambda$init$22;
                Object lambda$init$23;
                Object lambda$init$24;
                Object lambda$init$25;
                Object lambda$init$26;
                Object lambda$init$27;
                Object lambda$init$28;
                Object lambda$init$29;
                Object lambda$init$30;
                Object lambda$init$31;
                Object lambda$init$32;
                Object lambda$init$33;
                Object lambda$init$34;
                Object lambda$init$35;
                Object lambda$init$10;
                Object lambda$init$4;
                Object lambda$init$5;
                Object lambda$init$6;
                Object lambda$init$7;
                Object lambda$init$8;
                Object lambda$init$9;
                Object lambda$init$11;
                Object lambda$init$12;
                Object lambda$init$13;
                Object lambda$init$14;
                Object lambda$init$15;
                int i = r2;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i) {
                    case 0:
                        lambda$init$18 = NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$18;
                    case 1:
                        lambda$init$19 = NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$19;
                    case 2:
                        lambda$init$20 = NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$20;
                    case 3:
                        lambda$init$21 = NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$21;
                    case 4:
                        lambda$init$22 = NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$22;
                    case 5:
                        lambda$init$23 = NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$23;
                    case 6:
                        lambda$init$24 = NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$24;
                    case 7:
                        lambda$init$25 = NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$25;
                    case 8:
                        lambda$init$26 = NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$26;
                    case 9:
                        lambda$init$27 = NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$27;
                    case 10:
                        lambda$init$28 = NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$28;
                    case 11:
                        lambda$init$29 = NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$29;
                    case 12:
                        lambda$init$30 = NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$30;
                    case 13:
                        lambda$init$31 = NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$31;
                    case 14:
                        lambda$init$32 = NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$32;
                    case 15:
                        lambda$init$33 = NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$33;
                    case 16:
                        lambda$init$34 = NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$34;
                    case 17:
                        lambda$init$35 = NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$35;
                    case 18:
                        lambda$init$10 = NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$10;
                    case 19:
                        lambda$init$4 = NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$4;
                    case 20:
                        lambda$init$5 = NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$5;
                    case 21:
                        lambda$init$6 = NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$6;
                    case 22:
                        lambda$init$7 = NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$7;
                    case 23:
                        lambda$init$8 = NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$8;
                    case 24:
                        lambda$init$9 = NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$9;
                    case 25:
                        lambda$init$11 = NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$11;
                    case 26:
                        lambda$init$12 = NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$12;
                    case 27:
                        lambda$init$13 = NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$13;
                    case 28:
                        lambda$init$14 = NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$14;
                    default:
                        lambda$init$15 = NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$15;
                }
            }
        }, 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "filter", 1, new Callable() { // from class: ry7
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object lambda$init$18;
                Object lambda$init$19;
                Object lambda$init$20;
                Object lambda$init$21;
                Object lambda$init$22;
                Object lambda$init$23;
                Object lambda$init$24;
                Object lambda$init$25;
                Object lambda$init$26;
                Object lambda$init$27;
                Object lambda$init$28;
                Object lambda$init$29;
                Object lambda$init$30;
                Object lambda$init$31;
                Object lambda$init$32;
                Object lambda$init$33;
                Object lambda$init$34;
                Object lambda$init$35;
                Object lambda$init$10;
                Object lambda$init$4;
                Object lambda$init$5;
                Object lambda$init$6;
                Object lambda$init$7;
                Object lambda$init$8;
                Object lambda$init$9;
                Object lambda$init$11;
                Object lambda$init$12;
                Object lambda$init$13;
                Object lambda$init$14;
                Object lambda$init$15;
                int i = r2;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i) {
                    case 0:
                        lambda$init$18 = NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$18;
                    case 1:
                        lambda$init$19 = NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$19;
                    case 2:
                        lambda$init$20 = NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$20;
                    case 3:
                        lambda$init$21 = NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$21;
                    case 4:
                        lambda$init$22 = NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$22;
                    case 5:
                        lambda$init$23 = NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$23;
                    case 6:
                        lambda$init$24 = NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$24;
                    case 7:
                        lambda$init$25 = NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$25;
                    case 8:
                        lambda$init$26 = NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$26;
                    case 9:
                        lambda$init$27 = NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$27;
                    case 10:
                        lambda$init$28 = NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$28;
                    case 11:
                        lambda$init$29 = NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$29;
                    case 12:
                        lambda$init$30 = NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$30;
                    case 13:
                        lambda$init$31 = NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$31;
                    case 14:
                        lambda$init$32 = NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$32;
                    case 15:
                        lambda$init$33 = NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$33;
                    case 16:
                        lambda$init$34 = NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$34;
                    case 17:
                        lambda$init$35 = NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$35;
                    case 18:
                        lambda$init$10 = NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$10;
                    case 19:
                        lambda$init$4 = NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$4;
                    case 20:
                        lambda$init$5 = NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$5;
                    case 21:
                        lambda$init$6 = NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$6;
                    case 22:
                        lambda$init$7 = NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$7;
                    case 23:
                        lambda$init$8 = NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$8;
                    case 24:
                        lambda$init$9 = NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$9;
                    case 25:
                        lambda$init$11 = NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$11;
                    case 26:
                        lambda$init$12 = NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$12;
                    case 27:
                        lambda$init$13 = NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$13;
                    case 28:
                        lambda$init$14 = NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$14;
                    default:
                        lambda$init$15 = NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$15;
                }
            }
        }, 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "find", 1, new Callable() { // from class: ry7
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object lambda$init$18;
                Object lambda$init$19;
                Object lambda$init$20;
                Object lambda$init$21;
                Object lambda$init$22;
                Object lambda$init$23;
                Object lambda$init$24;
                Object lambda$init$25;
                Object lambda$init$26;
                Object lambda$init$27;
                Object lambda$init$28;
                Object lambda$init$29;
                Object lambda$init$30;
                Object lambda$init$31;
                Object lambda$init$32;
                Object lambda$init$33;
                Object lambda$init$34;
                Object lambda$init$35;
                Object lambda$init$10;
                Object lambda$init$4;
                Object lambda$init$5;
                Object lambda$init$6;
                Object lambda$init$7;
                Object lambda$init$8;
                Object lambda$init$9;
                Object lambda$init$11;
                Object lambda$init$12;
                Object lambda$init$13;
                Object lambda$init$14;
                Object lambda$init$15;
                int i = r2;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i) {
                    case 0:
                        lambda$init$18 = NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$18;
                    case 1:
                        lambda$init$19 = NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$19;
                    case 2:
                        lambda$init$20 = NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$20;
                    case 3:
                        lambda$init$21 = NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$21;
                    case 4:
                        lambda$init$22 = NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$22;
                    case 5:
                        lambda$init$23 = NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$23;
                    case 6:
                        lambda$init$24 = NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$24;
                    case 7:
                        lambda$init$25 = NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$25;
                    case 8:
                        lambda$init$26 = NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$26;
                    case 9:
                        lambda$init$27 = NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$27;
                    case 10:
                        lambda$init$28 = NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$28;
                    case 11:
                        lambda$init$29 = NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$29;
                    case 12:
                        lambda$init$30 = NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$30;
                    case 13:
                        lambda$init$31 = NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$31;
                    case 14:
                        lambda$init$32 = NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$32;
                    case 15:
                        lambda$init$33 = NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$33;
                    case 16:
                        lambda$init$34 = NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$34;
                    case 17:
                        lambda$init$35 = NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$35;
                    case 18:
                        lambda$init$10 = NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$10;
                    case 19:
                        lambda$init$4 = NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$4;
                    case 20:
                        lambda$init$5 = NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$5;
                    case 21:
                        lambda$init$6 = NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$6;
                    case 22:
                        lambda$init$7 = NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$7;
                    case 23:
                        lambda$init$8 = NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$8;
                    case 24:
                        lambda$init$9 = NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$9;
                    case 25:
                        lambda$init$11 = NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$11;
                    case 26:
                        lambda$init$12 = NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$12;
                    case 27:
                        lambda$init$13 = NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$13;
                    case 28:
                        lambda$init$14 = NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$14;
                    default:
                        lambda$init$15 = NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$15;
                }
            }
        }, 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "findIndex", 1, new Callable() { // from class: ry7
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object lambda$init$18;
                Object lambda$init$19;
                Object lambda$init$20;
                Object lambda$init$21;
                Object lambda$init$22;
                Object lambda$init$23;
                Object lambda$init$24;
                Object lambda$init$25;
                Object lambda$init$26;
                Object lambda$init$27;
                Object lambda$init$28;
                Object lambda$init$29;
                Object lambda$init$30;
                Object lambda$init$31;
                Object lambda$init$32;
                Object lambda$init$33;
                Object lambda$init$34;
                Object lambda$init$35;
                Object lambda$init$10;
                Object lambda$init$4;
                Object lambda$init$5;
                Object lambda$init$6;
                Object lambda$init$7;
                Object lambda$init$8;
                Object lambda$init$9;
                Object lambda$init$11;
                Object lambda$init$12;
                Object lambda$init$13;
                Object lambda$init$14;
                Object lambda$init$15;
                int i = r2;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i) {
                    case 0:
                        lambda$init$18 = NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$18;
                    case 1:
                        lambda$init$19 = NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$19;
                    case 2:
                        lambda$init$20 = NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$20;
                    case 3:
                        lambda$init$21 = NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$21;
                    case 4:
                        lambda$init$22 = NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$22;
                    case 5:
                        lambda$init$23 = NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$23;
                    case 6:
                        lambda$init$24 = NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$24;
                    case 7:
                        lambda$init$25 = NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$25;
                    case 8:
                        lambda$init$26 = NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$26;
                    case 9:
                        lambda$init$27 = NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$27;
                    case 10:
                        lambda$init$28 = NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$28;
                    case 11:
                        lambda$init$29 = NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$29;
                    case 12:
                        lambda$init$30 = NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$30;
                    case 13:
                        lambda$init$31 = NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$31;
                    case 14:
                        lambda$init$32 = NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$32;
                    case 15:
                        lambda$init$33 = NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$33;
                    case 16:
                        lambda$init$34 = NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$34;
                    case 17:
                        lambda$init$35 = NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$35;
                    case 18:
                        lambda$init$10 = NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$10;
                    case 19:
                        lambda$init$4 = NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$4;
                    case 20:
                        lambda$init$5 = NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$5;
                    case 21:
                        lambda$init$6 = NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$6;
                    case 22:
                        lambda$init$7 = NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$7;
                    case 23:
                        lambda$init$8 = NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$8;
                    case 24:
                        lambda$init$9 = NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$9;
                    case 25:
                        lambda$init$11 = NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$11;
                    case 26:
                        lambda$init$12 = NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$12;
                    case 27:
                        lambda$init$13 = NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$13;
                    case 28:
                        lambda$init$14 = NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$14;
                    default:
                        lambda$init$15 = NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$15;
                }
            }
        }, 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "findLast", 1, new Callable() { // from class: ry7
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object lambda$init$18;
                Object lambda$init$19;
                Object lambda$init$20;
                Object lambda$init$21;
                Object lambda$init$22;
                Object lambda$init$23;
                Object lambda$init$24;
                Object lambda$init$25;
                Object lambda$init$26;
                Object lambda$init$27;
                Object lambda$init$28;
                Object lambda$init$29;
                Object lambda$init$30;
                Object lambda$init$31;
                Object lambda$init$32;
                Object lambda$init$33;
                Object lambda$init$34;
                Object lambda$init$35;
                Object lambda$init$10;
                Object lambda$init$4;
                Object lambda$init$5;
                Object lambda$init$6;
                Object lambda$init$7;
                Object lambda$init$8;
                Object lambda$init$9;
                Object lambda$init$11;
                Object lambda$init$12;
                Object lambda$init$13;
                Object lambda$init$14;
                Object lambda$init$15;
                int i = r2;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i) {
                    case 0:
                        lambda$init$18 = NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$18;
                    case 1:
                        lambda$init$19 = NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$19;
                    case 2:
                        lambda$init$20 = NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$20;
                    case 3:
                        lambda$init$21 = NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$21;
                    case 4:
                        lambda$init$22 = NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$22;
                    case 5:
                        lambda$init$23 = NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$23;
                    case 6:
                        lambda$init$24 = NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$24;
                    case 7:
                        lambda$init$25 = NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$25;
                    case 8:
                        lambda$init$26 = NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$26;
                    case 9:
                        lambda$init$27 = NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$27;
                    case 10:
                        lambda$init$28 = NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$28;
                    case 11:
                        lambda$init$29 = NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$29;
                    case 12:
                        lambda$init$30 = NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$30;
                    case 13:
                        lambda$init$31 = NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$31;
                    case 14:
                        lambda$init$32 = NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$32;
                    case 15:
                        lambda$init$33 = NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$33;
                    case 16:
                        lambda$init$34 = NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$34;
                    case 17:
                        lambda$init$35 = NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$35;
                    case 18:
                        lambda$init$10 = NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$10;
                    case 19:
                        lambda$init$4 = NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$4;
                    case 20:
                        lambda$init$5 = NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$5;
                    case 21:
                        lambda$init$6 = NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$6;
                    case 22:
                        lambda$init$7 = NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$7;
                    case 23:
                        lambda$init$8 = NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$8;
                    case 24:
                        lambda$init$9 = NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$9;
                    case 25:
                        lambda$init$11 = NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$11;
                    case 26:
                        lambda$init$12 = NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$12;
                    case 27:
                        lambda$init$13 = NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$13;
                    case 28:
                        lambda$init$14 = NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$14;
                    default:
                        lambda$init$15 = NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$15;
                }
            }
        }, 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "findLastIndex", 1, new Callable() { // from class: ry7
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object lambda$init$18;
                Object lambda$init$19;
                Object lambda$init$20;
                Object lambda$init$21;
                Object lambda$init$22;
                Object lambda$init$23;
                Object lambda$init$24;
                Object lambda$init$25;
                Object lambda$init$26;
                Object lambda$init$27;
                Object lambda$init$28;
                Object lambda$init$29;
                Object lambda$init$30;
                Object lambda$init$31;
                Object lambda$init$32;
                Object lambda$init$33;
                Object lambda$init$34;
                Object lambda$init$35;
                Object lambda$init$10;
                Object lambda$init$4;
                Object lambda$init$5;
                Object lambda$init$6;
                Object lambda$init$7;
                Object lambda$init$8;
                Object lambda$init$9;
                Object lambda$init$11;
                Object lambda$init$12;
                Object lambda$init$13;
                Object lambda$init$14;
                Object lambda$init$15;
                int i = r2;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i) {
                    case 0:
                        lambda$init$18 = NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$18;
                    case 1:
                        lambda$init$19 = NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$19;
                    case 2:
                        lambda$init$20 = NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$20;
                    case 3:
                        lambda$init$21 = NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$21;
                    case 4:
                        lambda$init$22 = NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$22;
                    case 5:
                        lambda$init$23 = NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$23;
                    case 6:
                        lambda$init$24 = NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$24;
                    case 7:
                        lambda$init$25 = NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$25;
                    case 8:
                        lambda$init$26 = NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$26;
                    case 9:
                        lambda$init$27 = NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$27;
                    case 10:
                        lambda$init$28 = NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$28;
                    case 11:
                        lambda$init$29 = NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$29;
                    case 12:
                        lambda$init$30 = NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$30;
                    case 13:
                        lambda$init$31 = NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$31;
                    case 14:
                        lambda$init$32 = NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$32;
                    case 15:
                        lambda$init$33 = NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$33;
                    case 16:
                        lambda$init$34 = NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$34;
                    case 17:
                        lambda$init$35 = NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$35;
                    case 18:
                        lambda$init$10 = NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$10;
                    case 19:
                        lambda$init$4 = NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$4;
                    case 20:
                        lambda$init$5 = NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$5;
                    case 21:
                        lambda$init$6 = NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$6;
                    case 22:
                        lambda$init$7 = NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$7;
                    case 23:
                        lambda$init$8 = NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$8;
                    case 24:
                        lambda$init$9 = NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$9;
                    case 25:
                        lambda$init$11 = NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$11;
                    case 26:
                        lambda$init$12 = NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$12;
                    case 27:
                        lambda$init$13 = NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$13;
                    case 28:
                        lambda$init$14 = NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$14;
                    default:
                        lambda$init$15 = NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$15;
                }
            }
        }, 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "forEach", 1, new Callable() { // from class: ry7
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object lambda$init$18;
                Object lambda$init$19;
                Object lambda$init$20;
                Object lambda$init$21;
                Object lambda$init$22;
                Object lambda$init$23;
                Object lambda$init$24;
                Object lambda$init$25;
                Object lambda$init$26;
                Object lambda$init$27;
                Object lambda$init$28;
                Object lambda$init$29;
                Object lambda$init$30;
                Object lambda$init$31;
                Object lambda$init$32;
                Object lambda$init$33;
                Object lambda$init$34;
                Object lambda$init$35;
                Object lambda$init$10;
                Object lambda$init$4;
                Object lambda$init$5;
                Object lambda$init$6;
                Object lambda$init$7;
                Object lambda$init$8;
                Object lambda$init$9;
                Object lambda$init$11;
                Object lambda$init$12;
                Object lambda$init$13;
                Object lambda$init$14;
                Object lambda$init$15;
                int i = r2;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i) {
                    case 0:
                        lambda$init$18 = NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$18;
                    case 1:
                        lambda$init$19 = NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$19;
                    case 2:
                        lambda$init$20 = NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$20;
                    case 3:
                        lambda$init$21 = NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$21;
                    case 4:
                        lambda$init$22 = NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$22;
                    case 5:
                        lambda$init$23 = NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$23;
                    case 6:
                        lambda$init$24 = NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$24;
                    case 7:
                        lambda$init$25 = NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$25;
                    case 8:
                        lambda$init$26 = NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$26;
                    case 9:
                        lambda$init$27 = NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$27;
                    case 10:
                        lambda$init$28 = NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$28;
                    case 11:
                        lambda$init$29 = NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$29;
                    case 12:
                        lambda$init$30 = NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$30;
                    case 13:
                        lambda$init$31 = NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$31;
                    case 14:
                        lambda$init$32 = NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$32;
                    case 15:
                        lambda$init$33 = NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$33;
                    case 16:
                        lambda$init$34 = NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$34;
                    case 17:
                        lambda$init$35 = NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$35;
                    case 18:
                        lambda$init$10 = NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$10;
                    case 19:
                        lambda$init$4 = NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$4;
                    case 20:
                        lambda$init$5 = NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$5;
                    case 21:
                        lambda$init$6 = NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$6;
                    case 22:
                        lambda$init$7 = NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$7;
                    case 23:
                        lambda$init$8 = NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$8;
                    case 24:
                        lambda$init$9 = NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$9;
                    case 25:
                        lambda$init$11 = NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$11;
                    case 26:
                        lambda$init$12 = NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$12;
                    case 27:
                        lambda$init$13 = NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$13;
                    case 28:
                        lambda$init$14 = NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$14;
                    default:
                        lambda$init$15 = NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$15;
                }
            }
        }, 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "includes", 1, new Callable() { // from class: ry7
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object lambda$init$18;
                Object lambda$init$19;
                Object lambda$init$20;
                Object lambda$init$21;
                Object lambda$init$22;
                Object lambda$init$23;
                Object lambda$init$24;
                Object lambda$init$25;
                Object lambda$init$26;
                Object lambda$init$27;
                Object lambda$init$28;
                Object lambda$init$29;
                Object lambda$init$30;
                Object lambda$init$31;
                Object lambda$init$32;
                Object lambda$init$33;
                Object lambda$init$34;
                Object lambda$init$35;
                Object lambda$init$10;
                Object lambda$init$4;
                Object lambda$init$5;
                Object lambda$init$6;
                Object lambda$init$7;
                Object lambda$init$8;
                Object lambda$init$9;
                Object lambda$init$11;
                Object lambda$init$12;
                Object lambda$init$13;
                Object lambda$init$14;
                Object lambda$init$15;
                int i = r2;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i) {
                    case 0:
                        lambda$init$18 = NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$18;
                    case 1:
                        lambda$init$19 = NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$19;
                    case 2:
                        lambda$init$20 = NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$20;
                    case 3:
                        lambda$init$21 = NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$21;
                    case 4:
                        lambda$init$22 = NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$22;
                    case 5:
                        lambda$init$23 = NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$23;
                    case 6:
                        lambda$init$24 = NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$24;
                    case 7:
                        lambda$init$25 = NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$25;
                    case 8:
                        lambda$init$26 = NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$26;
                    case 9:
                        lambda$init$27 = NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$27;
                    case 10:
                        lambda$init$28 = NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$28;
                    case 11:
                        lambda$init$29 = NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$29;
                    case 12:
                        lambda$init$30 = NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$30;
                    case 13:
                        lambda$init$31 = NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$31;
                    case 14:
                        lambda$init$32 = NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$32;
                    case 15:
                        lambda$init$33 = NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$33;
                    case 16:
                        lambda$init$34 = NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$34;
                    case 17:
                        lambda$init$35 = NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$35;
                    case 18:
                        lambda$init$10 = NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$10;
                    case 19:
                        lambda$init$4 = NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$4;
                    case 20:
                        lambda$init$5 = NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$5;
                    case 21:
                        lambda$init$6 = NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$6;
                    case 22:
                        lambda$init$7 = NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$7;
                    case 23:
                        lambda$init$8 = NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$8;
                    case 24:
                        lambda$init$9 = NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$9;
                    case 25:
                        lambda$init$11 = NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$11;
                    case 26:
                        lambda$init$12 = NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$12;
                    case 27:
                        lambda$init$13 = NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$13;
                    case 28:
                        lambda$init$14 = NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$14;
                    default:
                        lambda$init$15 = NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$15;
                }
            }
        }, 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "indexOf", 1, new Callable() { // from class: ty7
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object lambda$init$16;
                Object lambda$init$17;
                int i = r2;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i) {
                    case 0:
                        lambda$init$16 = NativeTypedArrayView.lambda$init$16(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$16;
                    default:
                        lambda$init$17 = NativeTypedArrayView.lambda$init$17(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$17;
                }
            }
        }, 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "join", 1, new Callable() { // from class: ty7
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object lambda$init$16;
                Object lambda$init$17;
                int i = r2;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i) {
                    case 0:
                        lambda$init$16 = NativeTypedArrayView.lambda$init$16(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$16;
                    default:
                        lambda$init$17 = NativeTypedArrayView.lambda$init$17(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$17;
                }
            }
        }, 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "keys", 0, new Callable() { // from class: ry7
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object lambda$init$18;
                Object lambda$init$19;
                Object lambda$init$20;
                Object lambda$init$21;
                Object lambda$init$22;
                Object lambda$init$23;
                Object lambda$init$24;
                Object lambda$init$25;
                Object lambda$init$26;
                Object lambda$init$27;
                Object lambda$init$28;
                Object lambda$init$29;
                Object lambda$init$30;
                Object lambda$init$31;
                Object lambda$init$32;
                Object lambda$init$33;
                Object lambda$init$34;
                Object lambda$init$35;
                Object lambda$init$10;
                Object lambda$init$4;
                Object lambda$init$5;
                Object lambda$init$6;
                Object lambda$init$7;
                Object lambda$init$8;
                Object lambda$init$9;
                Object lambda$init$11;
                Object lambda$init$12;
                Object lambda$init$13;
                Object lambda$init$14;
                Object lambda$init$15;
                int i = r2;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i) {
                    case 0:
                        lambda$init$18 = NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$18;
                    case 1:
                        lambda$init$19 = NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$19;
                    case 2:
                        lambda$init$20 = NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$20;
                    case 3:
                        lambda$init$21 = NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$21;
                    case 4:
                        lambda$init$22 = NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$22;
                    case 5:
                        lambda$init$23 = NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$23;
                    case 6:
                        lambda$init$24 = NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$24;
                    case 7:
                        lambda$init$25 = NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$25;
                    case 8:
                        lambda$init$26 = NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$26;
                    case 9:
                        lambda$init$27 = NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$27;
                    case 10:
                        lambda$init$28 = NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$28;
                    case 11:
                        lambda$init$29 = NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$29;
                    case 12:
                        lambda$init$30 = NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$30;
                    case 13:
                        lambda$init$31 = NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$31;
                    case 14:
                        lambda$init$32 = NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$32;
                    case 15:
                        lambda$init$33 = NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$33;
                    case 16:
                        lambda$init$34 = NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$34;
                    case 17:
                        lambda$init$35 = NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$35;
                    case 18:
                        lambda$init$10 = NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$10;
                    case 19:
                        lambda$init$4 = NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$4;
                    case 20:
                        lambda$init$5 = NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$5;
                    case 21:
                        lambda$init$6 = NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$6;
                    case 22:
                        lambda$init$7 = NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$7;
                    case 23:
                        lambda$init$8 = NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$8;
                    case 24:
                        lambda$init$9 = NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$9;
                    case 25:
                        lambda$init$11 = NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$11;
                    case 26:
                        lambda$init$12 = NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$12;
                    case 27:
                        lambda$init$13 = NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$13;
                    case 28:
                        lambda$init$14 = NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$14;
                    default:
                        lambda$init$15 = NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$15;
                }
            }
        }, 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "lastIndexOf", 1, new Callable() { // from class: ry7
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object lambda$init$18;
                Object lambda$init$19;
                Object lambda$init$20;
                Object lambda$init$21;
                Object lambda$init$22;
                Object lambda$init$23;
                Object lambda$init$24;
                Object lambda$init$25;
                Object lambda$init$26;
                Object lambda$init$27;
                Object lambda$init$28;
                Object lambda$init$29;
                Object lambda$init$30;
                Object lambda$init$31;
                Object lambda$init$32;
                Object lambda$init$33;
                Object lambda$init$34;
                Object lambda$init$35;
                Object lambda$init$10;
                Object lambda$init$4;
                Object lambda$init$5;
                Object lambda$init$6;
                Object lambda$init$7;
                Object lambda$init$8;
                Object lambda$init$9;
                Object lambda$init$11;
                Object lambda$init$12;
                Object lambda$init$13;
                Object lambda$init$14;
                Object lambda$init$15;
                int i = r2;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i) {
                    case 0:
                        lambda$init$18 = NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$18;
                    case 1:
                        lambda$init$19 = NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$19;
                    case 2:
                        lambda$init$20 = NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$20;
                    case 3:
                        lambda$init$21 = NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$21;
                    case 4:
                        lambda$init$22 = NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$22;
                    case 5:
                        lambda$init$23 = NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$23;
                    case 6:
                        lambda$init$24 = NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$24;
                    case 7:
                        lambda$init$25 = NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$25;
                    case 8:
                        lambda$init$26 = NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$26;
                    case 9:
                        lambda$init$27 = NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$27;
                    case 10:
                        lambda$init$28 = NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$28;
                    case 11:
                        lambda$init$29 = NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$29;
                    case 12:
                        lambda$init$30 = NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$30;
                    case 13:
                        lambda$init$31 = NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$31;
                    case 14:
                        lambda$init$32 = NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$32;
                    case 15:
                        lambda$init$33 = NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$33;
                    case 16:
                        lambda$init$34 = NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$34;
                    case 17:
                        lambda$init$35 = NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$35;
                    case 18:
                        lambda$init$10 = NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$10;
                    case 19:
                        lambda$init$4 = NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$4;
                    case 20:
                        lambda$init$5 = NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$5;
                    case 21:
                        lambda$init$6 = NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$6;
                    case 22:
                        lambda$init$7 = NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$7;
                    case 23:
                        lambda$init$8 = NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$8;
                    case 24:
                        lambda$init$9 = NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$9;
                    case 25:
                        lambda$init$11 = NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$11;
                    case 26:
                        lambda$init$12 = NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$12;
                    case 27:
                        lambda$init$13 = NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$13;
                    case 28:
                        lambda$init$14 = NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$14;
                    default:
                        lambda$init$15 = NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$15;
                }
            }
        }, 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "map", 1, new Callable() { // from class: ry7
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object lambda$init$18;
                Object lambda$init$19;
                Object lambda$init$20;
                Object lambda$init$21;
                Object lambda$init$22;
                Object lambda$init$23;
                Object lambda$init$24;
                Object lambda$init$25;
                Object lambda$init$26;
                Object lambda$init$27;
                Object lambda$init$28;
                Object lambda$init$29;
                Object lambda$init$30;
                Object lambda$init$31;
                Object lambda$init$32;
                Object lambda$init$33;
                Object lambda$init$34;
                Object lambda$init$35;
                Object lambda$init$10;
                Object lambda$init$4;
                Object lambda$init$5;
                Object lambda$init$6;
                Object lambda$init$7;
                Object lambda$init$8;
                Object lambda$init$9;
                Object lambda$init$11;
                Object lambda$init$12;
                Object lambda$init$13;
                Object lambda$init$14;
                Object lambda$init$15;
                int i = r2;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i) {
                    case 0:
                        lambda$init$18 = NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$18;
                    case 1:
                        lambda$init$19 = NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$19;
                    case 2:
                        lambda$init$20 = NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$20;
                    case 3:
                        lambda$init$21 = NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$21;
                    case 4:
                        lambda$init$22 = NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$22;
                    case 5:
                        lambda$init$23 = NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$23;
                    case 6:
                        lambda$init$24 = NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$24;
                    case 7:
                        lambda$init$25 = NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$25;
                    case 8:
                        lambda$init$26 = NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$26;
                    case 9:
                        lambda$init$27 = NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$27;
                    case 10:
                        lambda$init$28 = NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$28;
                    case 11:
                        lambda$init$29 = NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$29;
                    case 12:
                        lambda$init$30 = NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$30;
                    case 13:
                        lambda$init$31 = NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$31;
                    case 14:
                        lambda$init$32 = NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$32;
                    case 15:
                        lambda$init$33 = NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$33;
                    case 16:
                        lambda$init$34 = NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$34;
                    case 17:
                        lambda$init$35 = NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$35;
                    case 18:
                        lambda$init$10 = NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$10;
                    case 19:
                        lambda$init$4 = NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$4;
                    case 20:
                        lambda$init$5 = NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$5;
                    case 21:
                        lambda$init$6 = NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$6;
                    case 22:
                        lambda$init$7 = NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$7;
                    case 23:
                        lambda$init$8 = NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$8;
                    case 24:
                        lambda$init$9 = NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$9;
                    case 25:
                        lambda$init$11 = NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$11;
                    case 26:
                        lambda$init$12 = NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$12;
                    case 27:
                        lambda$init$13 = NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$13;
                    case 28:
                        lambda$init$14 = NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$14;
                    default:
                        lambda$init$15 = NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$15;
                }
            }
        }, 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "reduce", 1, new Callable() { // from class: ry7
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object lambda$init$18;
                Object lambda$init$19;
                Object lambda$init$20;
                Object lambda$init$21;
                Object lambda$init$22;
                Object lambda$init$23;
                Object lambda$init$24;
                Object lambda$init$25;
                Object lambda$init$26;
                Object lambda$init$27;
                Object lambda$init$28;
                Object lambda$init$29;
                Object lambda$init$30;
                Object lambda$init$31;
                Object lambda$init$32;
                Object lambda$init$33;
                Object lambda$init$34;
                Object lambda$init$35;
                Object lambda$init$10;
                Object lambda$init$4;
                Object lambda$init$5;
                Object lambda$init$6;
                Object lambda$init$7;
                Object lambda$init$8;
                Object lambda$init$9;
                Object lambda$init$11;
                Object lambda$init$12;
                Object lambda$init$13;
                Object lambda$init$14;
                Object lambda$init$15;
                int i = r2;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i) {
                    case 0:
                        lambda$init$18 = NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$18;
                    case 1:
                        lambda$init$19 = NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$19;
                    case 2:
                        lambda$init$20 = NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$20;
                    case 3:
                        lambda$init$21 = NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$21;
                    case 4:
                        lambda$init$22 = NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$22;
                    case 5:
                        lambda$init$23 = NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$23;
                    case 6:
                        lambda$init$24 = NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$24;
                    case 7:
                        lambda$init$25 = NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$25;
                    case 8:
                        lambda$init$26 = NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$26;
                    case 9:
                        lambda$init$27 = NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$27;
                    case 10:
                        lambda$init$28 = NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$28;
                    case 11:
                        lambda$init$29 = NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$29;
                    case 12:
                        lambda$init$30 = NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$30;
                    case 13:
                        lambda$init$31 = NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$31;
                    case 14:
                        lambda$init$32 = NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$32;
                    case 15:
                        lambda$init$33 = NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$33;
                    case 16:
                        lambda$init$34 = NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$34;
                    case 17:
                        lambda$init$35 = NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$35;
                    case 18:
                        lambda$init$10 = NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$10;
                    case 19:
                        lambda$init$4 = NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$4;
                    case 20:
                        lambda$init$5 = NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$5;
                    case 21:
                        lambda$init$6 = NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$6;
                    case 22:
                        lambda$init$7 = NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$7;
                    case 23:
                        lambda$init$8 = NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$8;
                    case 24:
                        lambda$init$9 = NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$9;
                    case 25:
                        lambda$init$11 = NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$11;
                    case 26:
                        lambda$init$12 = NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$12;
                    case 27:
                        lambda$init$13 = NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$13;
                    case 28:
                        lambda$init$14 = NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$14;
                    default:
                        lambda$init$15 = NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$15;
                }
            }
        }, 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "reduceRight", 1, new Callable() { // from class: ry7
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object lambda$init$18;
                Object lambda$init$19;
                Object lambda$init$20;
                Object lambda$init$21;
                Object lambda$init$22;
                Object lambda$init$23;
                Object lambda$init$24;
                Object lambda$init$25;
                Object lambda$init$26;
                Object lambda$init$27;
                Object lambda$init$28;
                Object lambda$init$29;
                Object lambda$init$30;
                Object lambda$init$31;
                Object lambda$init$32;
                Object lambda$init$33;
                Object lambda$init$34;
                Object lambda$init$35;
                Object lambda$init$10;
                Object lambda$init$4;
                Object lambda$init$5;
                Object lambda$init$6;
                Object lambda$init$7;
                Object lambda$init$8;
                Object lambda$init$9;
                Object lambda$init$11;
                Object lambda$init$12;
                Object lambda$init$13;
                Object lambda$init$14;
                Object lambda$init$15;
                int i = r2;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i) {
                    case 0:
                        lambda$init$18 = NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$18;
                    case 1:
                        lambda$init$19 = NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$19;
                    case 2:
                        lambda$init$20 = NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$20;
                    case 3:
                        lambda$init$21 = NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$21;
                    case 4:
                        lambda$init$22 = NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$22;
                    case 5:
                        lambda$init$23 = NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$23;
                    case 6:
                        lambda$init$24 = NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$24;
                    case 7:
                        lambda$init$25 = NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$25;
                    case 8:
                        lambda$init$26 = NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$26;
                    case 9:
                        lambda$init$27 = NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$27;
                    case 10:
                        lambda$init$28 = NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$28;
                    case 11:
                        lambda$init$29 = NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$29;
                    case 12:
                        lambda$init$30 = NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$30;
                    case 13:
                        lambda$init$31 = NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$31;
                    case 14:
                        lambda$init$32 = NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$32;
                    case 15:
                        lambda$init$33 = NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$33;
                    case 16:
                        lambda$init$34 = NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$34;
                    case 17:
                        lambda$init$35 = NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$35;
                    case 18:
                        lambda$init$10 = NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$10;
                    case 19:
                        lambda$init$4 = NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$4;
                    case 20:
                        lambda$init$5 = NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$5;
                    case 21:
                        lambda$init$6 = NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$6;
                    case 22:
                        lambda$init$7 = NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$7;
                    case 23:
                        lambda$init$8 = NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$8;
                    case 24:
                        lambda$init$9 = NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$9;
                    case 25:
                        lambda$init$11 = NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$11;
                    case 26:
                        lambda$init$12 = NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$12;
                    case 27:
                        lambda$init$13 = NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$13;
                    case 28:
                        lambda$init$14 = NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$14;
                    default:
                        lambda$init$15 = NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$15;
                }
            }
        }, 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "reverse", 0, new Callable() { // from class: ry7
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object lambda$init$18;
                Object lambda$init$19;
                Object lambda$init$20;
                Object lambda$init$21;
                Object lambda$init$22;
                Object lambda$init$23;
                Object lambda$init$24;
                Object lambda$init$25;
                Object lambda$init$26;
                Object lambda$init$27;
                Object lambda$init$28;
                Object lambda$init$29;
                Object lambda$init$30;
                Object lambda$init$31;
                Object lambda$init$32;
                Object lambda$init$33;
                Object lambda$init$34;
                Object lambda$init$35;
                Object lambda$init$10;
                Object lambda$init$4;
                Object lambda$init$5;
                Object lambda$init$6;
                Object lambda$init$7;
                Object lambda$init$8;
                Object lambda$init$9;
                Object lambda$init$11;
                Object lambda$init$12;
                Object lambda$init$13;
                Object lambda$init$14;
                Object lambda$init$15;
                int i = r2;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i) {
                    case 0:
                        lambda$init$18 = NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$18;
                    case 1:
                        lambda$init$19 = NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$19;
                    case 2:
                        lambda$init$20 = NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$20;
                    case 3:
                        lambda$init$21 = NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$21;
                    case 4:
                        lambda$init$22 = NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$22;
                    case 5:
                        lambda$init$23 = NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$23;
                    case 6:
                        lambda$init$24 = NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$24;
                    case 7:
                        lambda$init$25 = NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$25;
                    case 8:
                        lambda$init$26 = NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$26;
                    case 9:
                        lambda$init$27 = NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$27;
                    case 10:
                        lambda$init$28 = NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$28;
                    case 11:
                        lambda$init$29 = NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$29;
                    case 12:
                        lambda$init$30 = NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$30;
                    case 13:
                        lambda$init$31 = NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$31;
                    case 14:
                        lambda$init$32 = NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$32;
                    case 15:
                        lambda$init$33 = NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$33;
                    case 16:
                        lambda$init$34 = NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$34;
                    case 17:
                        lambda$init$35 = NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$35;
                    case 18:
                        lambda$init$10 = NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$10;
                    case 19:
                        lambda$init$4 = NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$4;
                    case 20:
                        lambda$init$5 = NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$5;
                    case 21:
                        lambda$init$6 = NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$6;
                    case 22:
                        lambda$init$7 = NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$7;
                    case 23:
                        lambda$init$8 = NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$8;
                    case 24:
                        lambda$init$9 = NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$9;
                    case 25:
                        lambda$init$11 = NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$11;
                    case 26:
                        lambda$init$12 = NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$12;
                    case 27:
                        lambda$init$13 = NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$13;
                    case 28:
                        lambda$init$14 = NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$14;
                    default:
                        lambda$init$15 = NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$15;
                }
            }
        }, 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "set", 0, new Callable() { // from class: ry7
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object lambda$init$18;
                Object lambda$init$19;
                Object lambda$init$20;
                Object lambda$init$21;
                Object lambda$init$22;
                Object lambda$init$23;
                Object lambda$init$24;
                Object lambda$init$25;
                Object lambda$init$26;
                Object lambda$init$27;
                Object lambda$init$28;
                Object lambda$init$29;
                Object lambda$init$30;
                Object lambda$init$31;
                Object lambda$init$32;
                Object lambda$init$33;
                Object lambda$init$34;
                Object lambda$init$35;
                Object lambda$init$10;
                Object lambda$init$4;
                Object lambda$init$5;
                Object lambda$init$6;
                Object lambda$init$7;
                Object lambda$init$8;
                Object lambda$init$9;
                Object lambda$init$11;
                Object lambda$init$12;
                Object lambda$init$13;
                Object lambda$init$14;
                Object lambda$init$15;
                int i = r2;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i) {
                    case 0:
                        lambda$init$18 = NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$18;
                    case 1:
                        lambda$init$19 = NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$19;
                    case 2:
                        lambda$init$20 = NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$20;
                    case 3:
                        lambda$init$21 = NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$21;
                    case 4:
                        lambda$init$22 = NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$22;
                    case 5:
                        lambda$init$23 = NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$23;
                    case 6:
                        lambda$init$24 = NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$24;
                    case 7:
                        lambda$init$25 = NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$25;
                    case 8:
                        lambda$init$26 = NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$26;
                    case 9:
                        lambda$init$27 = NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$27;
                    case 10:
                        lambda$init$28 = NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$28;
                    case 11:
                        lambda$init$29 = NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$29;
                    case 12:
                        lambda$init$30 = NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$30;
                    case 13:
                        lambda$init$31 = NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$31;
                    case 14:
                        lambda$init$32 = NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$32;
                    case 15:
                        lambda$init$33 = NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$33;
                    case 16:
                        lambda$init$34 = NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$34;
                    case 17:
                        lambda$init$35 = NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$35;
                    case 18:
                        lambda$init$10 = NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$10;
                    case 19:
                        lambda$init$4 = NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$4;
                    case 20:
                        lambda$init$5 = NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$5;
                    case 21:
                        lambda$init$6 = NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$6;
                    case 22:
                        lambda$init$7 = NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$7;
                    case 23:
                        lambda$init$8 = NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$8;
                    case 24:
                        lambda$init$9 = NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$9;
                    case 25:
                        lambda$init$11 = NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$11;
                    case 26:
                        lambda$init$12 = NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$12;
                    case 27:
                        lambda$init$13 = NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$13;
                    case 28:
                        lambda$init$14 = NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$14;
                    default:
                        lambda$init$15 = NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$15;
                }
            }
        }, 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "slice", 2, new Callable() { // from class: ry7
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object lambda$init$18;
                Object lambda$init$19;
                Object lambda$init$20;
                Object lambda$init$21;
                Object lambda$init$22;
                Object lambda$init$23;
                Object lambda$init$24;
                Object lambda$init$25;
                Object lambda$init$26;
                Object lambda$init$27;
                Object lambda$init$28;
                Object lambda$init$29;
                Object lambda$init$30;
                Object lambda$init$31;
                Object lambda$init$32;
                Object lambda$init$33;
                Object lambda$init$34;
                Object lambda$init$35;
                Object lambda$init$10;
                Object lambda$init$4;
                Object lambda$init$5;
                Object lambda$init$6;
                Object lambda$init$7;
                Object lambda$init$8;
                Object lambda$init$9;
                Object lambda$init$11;
                Object lambda$init$12;
                Object lambda$init$13;
                Object lambda$init$14;
                Object lambda$init$15;
                int i = r2;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i) {
                    case 0:
                        lambda$init$18 = NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$18;
                    case 1:
                        lambda$init$19 = NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$19;
                    case 2:
                        lambda$init$20 = NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$20;
                    case 3:
                        lambda$init$21 = NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$21;
                    case 4:
                        lambda$init$22 = NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$22;
                    case 5:
                        lambda$init$23 = NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$23;
                    case 6:
                        lambda$init$24 = NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$24;
                    case 7:
                        lambda$init$25 = NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$25;
                    case 8:
                        lambda$init$26 = NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$26;
                    case 9:
                        lambda$init$27 = NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$27;
                    case 10:
                        lambda$init$28 = NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$28;
                    case 11:
                        lambda$init$29 = NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$29;
                    case 12:
                        lambda$init$30 = NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$30;
                    case 13:
                        lambda$init$31 = NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$31;
                    case 14:
                        lambda$init$32 = NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$32;
                    case 15:
                        lambda$init$33 = NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$33;
                    case 16:
                        lambda$init$34 = NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$34;
                    case 17:
                        lambda$init$35 = NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$35;
                    case 18:
                        lambda$init$10 = NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$10;
                    case 19:
                        lambda$init$4 = NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$4;
                    case 20:
                        lambda$init$5 = NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$5;
                    case 21:
                        lambda$init$6 = NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$6;
                    case 22:
                        lambda$init$7 = NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$7;
                    case 23:
                        lambda$init$8 = NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$8;
                    case 24:
                        lambda$init$9 = NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$9;
                    case 25:
                        lambda$init$11 = NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$11;
                    case 26:
                        lambda$init$12 = NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$12;
                    case 27:
                        lambda$init$13 = NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$13;
                    case 28:
                        lambda$init$14 = NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$14;
                    default:
                        lambda$init$15 = NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$15;
                }
            }
        }, 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "some", 1, new Callable() { // from class: ry7
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object lambda$init$18;
                Object lambda$init$19;
                Object lambda$init$20;
                Object lambda$init$21;
                Object lambda$init$22;
                Object lambda$init$23;
                Object lambda$init$24;
                Object lambda$init$25;
                Object lambda$init$26;
                Object lambda$init$27;
                Object lambda$init$28;
                Object lambda$init$29;
                Object lambda$init$30;
                Object lambda$init$31;
                Object lambda$init$32;
                Object lambda$init$33;
                Object lambda$init$34;
                Object lambda$init$35;
                Object lambda$init$10;
                Object lambda$init$4;
                Object lambda$init$5;
                Object lambda$init$6;
                Object lambda$init$7;
                Object lambda$init$8;
                Object lambda$init$9;
                Object lambda$init$11;
                Object lambda$init$12;
                Object lambda$init$13;
                Object lambda$init$14;
                Object lambda$init$15;
                int i = r2;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i) {
                    case 0:
                        lambda$init$18 = NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$18;
                    case 1:
                        lambda$init$19 = NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$19;
                    case 2:
                        lambda$init$20 = NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$20;
                    case 3:
                        lambda$init$21 = NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$21;
                    case 4:
                        lambda$init$22 = NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$22;
                    case 5:
                        lambda$init$23 = NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$23;
                    case 6:
                        lambda$init$24 = NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$24;
                    case 7:
                        lambda$init$25 = NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$25;
                    case 8:
                        lambda$init$26 = NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$26;
                    case 9:
                        lambda$init$27 = NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$27;
                    case 10:
                        lambda$init$28 = NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$28;
                    case 11:
                        lambda$init$29 = NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$29;
                    case 12:
                        lambda$init$30 = NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$30;
                    case 13:
                        lambda$init$31 = NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$31;
                    case 14:
                        lambda$init$32 = NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$32;
                    case 15:
                        lambda$init$33 = NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$33;
                    case 16:
                        lambda$init$34 = NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$34;
                    case 17:
                        lambda$init$35 = NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$35;
                    case 18:
                        lambda$init$10 = NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$10;
                    case 19:
                        lambda$init$4 = NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$4;
                    case 20:
                        lambda$init$5 = NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$5;
                    case 21:
                        lambda$init$6 = NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$6;
                    case 22:
                        lambda$init$7 = NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$7;
                    case 23:
                        lambda$init$8 = NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$8;
                    case 24:
                        lambda$init$9 = NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$9;
                    case 25:
                        lambda$init$11 = NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$11;
                    case 26:
                        lambda$init$12 = NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$12;
                    case 27:
                        lambda$init$13 = NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$13;
                    case 28:
                        lambda$init$14 = NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$14;
                    default:
                        lambda$init$15 = NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$15;
                }
            }
        }, 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "sort", 1, new Callable() { // from class: ry7
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object lambda$init$18;
                Object lambda$init$19;
                Object lambda$init$20;
                Object lambda$init$21;
                Object lambda$init$22;
                Object lambda$init$23;
                Object lambda$init$24;
                Object lambda$init$25;
                Object lambda$init$26;
                Object lambda$init$27;
                Object lambda$init$28;
                Object lambda$init$29;
                Object lambda$init$30;
                Object lambda$init$31;
                Object lambda$init$32;
                Object lambda$init$33;
                Object lambda$init$34;
                Object lambda$init$35;
                Object lambda$init$10;
                Object lambda$init$4;
                Object lambda$init$5;
                Object lambda$init$6;
                Object lambda$init$7;
                Object lambda$init$8;
                Object lambda$init$9;
                Object lambda$init$11;
                Object lambda$init$12;
                Object lambda$init$13;
                Object lambda$init$14;
                Object lambda$init$15;
                int i = r2;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i) {
                    case 0:
                        lambda$init$18 = NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$18;
                    case 1:
                        lambda$init$19 = NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$19;
                    case 2:
                        lambda$init$20 = NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$20;
                    case 3:
                        lambda$init$21 = NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$21;
                    case 4:
                        lambda$init$22 = NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$22;
                    case 5:
                        lambda$init$23 = NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$23;
                    case 6:
                        lambda$init$24 = NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$24;
                    case 7:
                        lambda$init$25 = NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$25;
                    case 8:
                        lambda$init$26 = NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$26;
                    case 9:
                        lambda$init$27 = NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$27;
                    case 10:
                        lambda$init$28 = NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$28;
                    case 11:
                        lambda$init$29 = NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$29;
                    case 12:
                        lambda$init$30 = NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$30;
                    case 13:
                        lambda$init$31 = NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$31;
                    case 14:
                        lambda$init$32 = NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$32;
                    case 15:
                        lambda$init$33 = NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$33;
                    case 16:
                        lambda$init$34 = NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$34;
                    case 17:
                        lambda$init$35 = NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$35;
                    case 18:
                        lambda$init$10 = NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$10;
                    case 19:
                        lambda$init$4 = NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$4;
                    case 20:
                        lambda$init$5 = NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$5;
                    case 21:
                        lambda$init$6 = NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$6;
                    case 22:
                        lambda$init$7 = NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$7;
                    case 23:
                        lambda$init$8 = NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$8;
                    case 24:
                        lambda$init$9 = NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$9;
                    case 25:
                        lambda$init$11 = NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$11;
                    case 26:
                        lambda$init$12 = NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$12;
                    case 27:
                        lambda$init$13 = NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$13;
                    case 28:
                        lambda$init$14 = NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$14;
                    default:
                        lambda$init$15 = NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$15;
                }
            }
        }, 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "subarray", 2, new Callable() { // from class: ry7
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object lambda$init$18;
                Object lambda$init$19;
                Object lambda$init$20;
                Object lambda$init$21;
                Object lambda$init$22;
                Object lambda$init$23;
                Object lambda$init$24;
                Object lambda$init$25;
                Object lambda$init$26;
                Object lambda$init$27;
                Object lambda$init$28;
                Object lambda$init$29;
                Object lambda$init$30;
                Object lambda$init$31;
                Object lambda$init$32;
                Object lambda$init$33;
                Object lambda$init$34;
                Object lambda$init$35;
                Object lambda$init$10;
                Object lambda$init$4;
                Object lambda$init$5;
                Object lambda$init$6;
                Object lambda$init$7;
                Object lambda$init$8;
                Object lambda$init$9;
                Object lambda$init$11;
                Object lambda$init$12;
                Object lambda$init$13;
                Object lambda$init$14;
                Object lambda$init$15;
                int i = r2;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i) {
                    case 0:
                        lambda$init$18 = NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$18;
                    case 1:
                        lambda$init$19 = NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$19;
                    case 2:
                        lambda$init$20 = NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$20;
                    case 3:
                        lambda$init$21 = NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$21;
                    case 4:
                        lambda$init$22 = NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$22;
                    case 5:
                        lambda$init$23 = NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$23;
                    case 6:
                        lambda$init$24 = NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$24;
                    case 7:
                        lambda$init$25 = NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$25;
                    case 8:
                        lambda$init$26 = NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$26;
                    case 9:
                        lambda$init$27 = NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$27;
                    case 10:
                        lambda$init$28 = NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$28;
                    case 11:
                        lambda$init$29 = NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$29;
                    case 12:
                        lambda$init$30 = NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$30;
                    case 13:
                        lambda$init$31 = NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$31;
                    case 14:
                        lambda$init$32 = NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$32;
                    case 15:
                        lambda$init$33 = NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$33;
                    case 16:
                        lambda$init$34 = NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$34;
                    case 17:
                        lambda$init$35 = NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$35;
                    case 18:
                        lambda$init$10 = NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$10;
                    case 19:
                        lambda$init$4 = NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$4;
                    case 20:
                        lambda$init$5 = NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$5;
                    case 21:
                        lambda$init$6 = NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$6;
                    case 22:
                        lambda$init$7 = NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$7;
                    case 23:
                        lambda$init$8 = NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$8;
                    case 24:
                        lambda$init$9 = NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$9;
                    case 25:
                        lambda$init$11 = NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$11;
                    case 26:
                        lambda$init$12 = NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$12;
                    case 27:
                        lambda$init$13 = NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$13;
                    case 28:
                        lambda$init$14 = NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$14;
                    default:
                        lambda$init$15 = NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$15;
                }
            }
        }, 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "toLocaleString", 0, new Callable() { // from class: ry7
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object lambda$init$18;
                Object lambda$init$19;
                Object lambda$init$20;
                Object lambda$init$21;
                Object lambda$init$22;
                Object lambda$init$23;
                Object lambda$init$24;
                Object lambda$init$25;
                Object lambda$init$26;
                Object lambda$init$27;
                Object lambda$init$28;
                Object lambda$init$29;
                Object lambda$init$30;
                Object lambda$init$31;
                Object lambda$init$32;
                Object lambda$init$33;
                Object lambda$init$34;
                Object lambda$init$35;
                Object lambda$init$10;
                Object lambda$init$4;
                Object lambda$init$5;
                Object lambda$init$6;
                Object lambda$init$7;
                Object lambda$init$8;
                Object lambda$init$9;
                Object lambda$init$11;
                Object lambda$init$12;
                Object lambda$init$13;
                Object lambda$init$14;
                Object lambda$init$15;
                int i = r2;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i) {
                    case 0:
                        lambda$init$18 = NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$18;
                    case 1:
                        lambda$init$19 = NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$19;
                    case 2:
                        lambda$init$20 = NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$20;
                    case 3:
                        lambda$init$21 = NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$21;
                    case 4:
                        lambda$init$22 = NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$22;
                    case 5:
                        lambda$init$23 = NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$23;
                    case 6:
                        lambda$init$24 = NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$24;
                    case 7:
                        lambda$init$25 = NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$25;
                    case 8:
                        lambda$init$26 = NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$26;
                    case 9:
                        lambda$init$27 = NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$27;
                    case 10:
                        lambda$init$28 = NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$28;
                    case 11:
                        lambda$init$29 = NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$29;
                    case 12:
                        lambda$init$30 = NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$30;
                    case 13:
                        lambda$init$31 = NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$31;
                    case 14:
                        lambda$init$32 = NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$32;
                    case 15:
                        lambda$init$33 = NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$33;
                    case 16:
                        lambda$init$34 = NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$34;
                    case 17:
                        lambda$init$35 = NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$35;
                    case 18:
                        lambda$init$10 = NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$10;
                    case 19:
                        lambda$init$4 = NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$4;
                    case 20:
                        lambda$init$5 = NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$5;
                    case 21:
                        lambda$init$6 = NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$6;
                    case 22:
                        lambda$init$7 = NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$7;
                    case 23:
                        lambda$init$8 = NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$8;
                    case 24:
                        lambda$init$9 = NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$9;
                    case 25:
                        lambda$init$11 = NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$11;
                    case 26:
                        lambda$init$12 = NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$12;
                    case 27:
                        lambda$init$13 = NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$13;
                    case 28:
                        lambda$init$14 = NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$14;
                    default:
                        lambda$init$15 = NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$15;
                }
            }
        }, 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "toReversed", 0, new Callable() { // from class: ry7
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object lambda$init$18;
                Object lambda$init$19;
                Object lambda$init$20;
                Object lambda$init$21;
                Object lambda$init$22;
                Object lambda$init$23;
                Object lambda$init$24;
                Object lambda$init$25;
                Object lambda$init$26;
                Object lambda$init$27;
                Object lambda$init$28;
                Object lambda$init$29;
                Object lambda$init$30;
                Object lambda$init$31;
                Object lambda$init$32;
                Object lambda$init$33;
                Object lambda$init$34;
                Object lambda$init$35;
                Object lambda$init$10;
                Object lambda$init$4;
                Object lambda$init$5;
                Object lambda$init$6;
                Object lambda$init$7;
                Object lambda$init$8;
                Object lambda$init$9;
                Object lambda$init$11;
                Object lambda$init$12;
                Object lambda$init$13;
                Object lambda$init$14;
                Object lambda$init$15;
                int i = r2;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i) {
                    case 0:
                        lambda$init$18 = NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$18;
                    case 1:
                        lambda$init$19 = NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$19;
                    case 2:
                        lambda$init$20 = NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$20;
                    case 3:
                        lambda$init$21 = NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$21;
                    case 4:
                        lambda$init$22 = NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$22;
                    case 5:
                        lambda$init$23 = NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$23;
                    case 6:
                        lambda$init$24 = NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$24;
                    case 7:
                        lambda$init$25 = NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$25;
                    case 8:
                        lambda$init$26 = NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$26;
                    case 9:
                        lambda$init$27 = NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$27;
                    case 10:
                        lambda$init$28 = NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$28;
                    case 11:
                        lambda$init$29 = NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$29;
                    case 12:
                        lambda$init$30 = NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$30;
                    case 13:
                        lambda$init$31 = NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$31;
                    case 14:
                        lambda$init$32 = NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$32;
                    case 15:
                        lambda$init$33 = NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$33;
                    case 16:
                        lambda$init$34 = NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$34;
                    case 17:
                        lambda$init$35 = NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$35;
                    case 18:
                        lambda$init$10 = NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$10;
                    case 19:
                        lambda$init$4 = NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$4;
                    case 20:
                        lambda$init$5 = NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$5;
                    case 21:
                        lambda$init$6 = NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$6;
                    case 22:
                        lambda$init$7 = NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$7;
                    case 23:
                        lambda$init$8 = NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$8;
                    case 24:
                        lambda$init$9 = NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$9;
                    case 25:
                        lambda$init$11 = NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$11;
                    case 26:
                        lambda$init$12 = NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$12;
                    case 27:
                        lambda$init$13 = NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$13;
                    case 28:
                        lambda$init$14 = NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$14;
                    default:
                        lambda$init$15 = NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$15;
                }
            }
        }, 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "toSorted", 1, new Callable() { // from class: ry7
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object lambda$init$18;
                Object lambda$init$19;
                Object lambda$init$20;
                Object lambda$init$21;
                Object lambda$init$22;
                Object lambda$init$23;
                Object lambda$init$24;
                Object lambda$init$25;
                Object lambda$init$26;
                Object lambda$init$27;
                Object lambda$init$28;
                Object lambda$init$29;
                Object lambda$init$30;
                Object lambda$init$31;
                Object lambda$init$32;
                Object lambda$init$33;
                Object lambda$init$34;
                Object lambda$init$35;
                Object lambda$init$10;
                Object lambda$init$4;
                Object lambda$init$5;
                Object lambda$init$6;
                Object lambda$init$7;
                Object lambda$init$8;
                Object lambda$init$9;
                Object lambda$init$11;
                Object lambda$init$12;
                Object lambda$init$13;
                Object lambda$init$14;
                Object lambda$init$15;
                int i = r2;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i) {
                    case 0:
                        lambda$init$18 = NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$18;
                    case 1:
                        lambda$init$19 = NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$19;
                    case 2:
                        lambda$init$20 = NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$20;
                    case 3:
                        lambda$init$21 = NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$21;
                    case 4:
                        lambda$init$22 = NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$22;
                    case 5:
                        lambda$init$23 = NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$23;
                    case 6:
                        lambda$init$24 = NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$24;
                    case 7:
                        lambda$init$25 = NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$25;
                    case 8:
                        lambda$init$26 = NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$26;
                    case 9:
                        lambda$init$27 = NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$27;
                    case 10:
                        lambda$init$28 = NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$28;
                    case 11:
                        lambda$init$29 = NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$29;
                    case 12:
                        lambda$init$30 = NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$30;
                    case 13:
                        lambda$init$31 = NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$31;
                    case 14:
                        lambda$init$32 = NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$32;
                    case 15:
                        lambda$init$33 = NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$33;
                    case 16:
                        lambda$init$34 = NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$34;
                    case 17:
                        lambda$init$35 = NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$35;
                    case 18:
                        lambda$init$10 = NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$10;
                    case 19:
                        lambda$init$4 = NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$4;
                    case 20:
                        lambda$init$5 = NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$5;
                    case 21:
                        lambda$init$6 = NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$6;
                    case 22:
                        lambda$init$7 = NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$7;
                    case 23:
                        lambda$init$8 = NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$8;
                    case 24:
                        lambda$init$9 = NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$9;
                    case 25:
                        lambda$init$11 = NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$11;
                    case 26:
                        lambda$init$12 = NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$12;
                    case 27:
                        lambda$init$13 = NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$13;
                    case 28:
                        lambda$init$14 = NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$14;
                    default:
                        lambda$init$15 = NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$15;
                }
            }
        }, 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "toString", 0, new Callable() { // from class: ry7
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object lambda$init$18;
                Object lambda$init$19;
                Object lambda$init$20;
                Object lambda$init$21;
                Object lambda$init$22;
                Object lambda$init$23;
                Object lambda$init$24;
                Object lambda$init$25;
                Object lambda$init$26;
                Object lambda$init$27;
                Object lambda$init$28;
                Object lambda$init$29;
                Object lambda$init$30;
                Object lambda$init$31;
                Object lambda$init$32;
                Object lambda$init$33;
                Object lambda$init$34;
                Object lambda$init$35;
                Object lambda$init$10;
                Object lambda$init$4;
                Object lambda$init$5;
                Object lambda$init$6;
                Object lambda$init$7;
                Object lambda$init$8;
                Object lambda$init$9;
                Object lambda$init$11;
                Object lambda$init$12;
                Object lambda$init$13;
                Object lambda$init$14;
                Object lambda$init$15;
                int i = r2;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i) {
                    case 0:
                        lambda$init$18 = NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$18;
                    case 1:
                        lambda$init$19 = NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$19;
                    case 2:
                        lambda$init$20 = NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$20;
                    case 3:
                        lambda$init$21 = NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$21;
                    case 4:
                        lambda$init$22 = NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$22;
                    case 5:
                        lambda$init$23 = NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$23;
                    case 6:
                        lambda$init$24 = NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$24;
                    case 7:
                        lambda$init$25 = NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$25;
                    case 8:
                        lambda$init$26 = NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$26;
                    case 9:
                        lambda$init$27 = NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$27;
                    case 10:
                        lambda$init$28 = NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$28;
                    case 11:
                        lambda$init$29 = NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$29;
                    case 12:
                        lambda$init$30 = NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$30;
                    case 13:
                        lambda$init$31 = NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$31;
                    case 14:
                        lambda$init$32 = NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$32;
                    case 15:
                        lambda$init$33 = NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$33;
                    case 16:
                        lambda$init$34 = NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$34;
                    case 17:
                        lambda$init$35 = NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$35;
                    case 18:
                        lambda$init$10 = NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$10;
                    case 19:
                        lambda$init$4 = NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$4;
                    case 20:
                        lambda$init$5 = NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$5;
                    case 21:
                        lambda$init$6 = NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$6;
                    case 22:
                        lambda$init$7 = NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$7;
                    case 23:
                        lambda$init$8 = NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$8;
                    case 24:
                        lambda$init$9 = NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$9;
                    case 25:
                        lambda$init$11 = NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$11;
                    case 26:
                        lambda$init$12 = NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$12;
                    case 27:
                        lambda$init$13 = NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$13;
                    case 28:
                        lambda$init$14 = NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$14;
                    default:
                        lambda$init$15 = NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$15;
                }
            }
        }, 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "values", 0, new Callable() { // from class: ry7
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object lambda$init$18;
                Object lambda$init$19;
                Object lambda$init$20;
                Object lambda$init$21;
                Object lambda$init$22;
                Object lambda$init$23;
                Object lambda$init$24;
                Object lambda$init$25;
                Object lambda$init$26;
                Object lambda$init$27;
                Object lambda$init$28;
                Object lambda$init$29;
                Object lambda$init$30;
                Object lambda$init$31;
                Object lambda$init$32;
                Object lambda$init$33;
                Object lambda$init$34;
                Object lambda$init$35;
                Object lambda$init$10;
                Object lambda$init$4;
                Object lambda$init$5;
                Object lambda$init$6;
                Object lambda$init$7;
                Object lambda$init$8;
                Object lambda$init$9;
                Object lambda$init$11;
                Object lambda$init$12;
                Object lambda$init$13;
                Object lambda$init$14;
                Object lambda$init$15;
                int i = r2;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i) {
                    case 0:
                        lambda$init$18 = NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$18;
                    case 1:
                        lambda$init$19 = NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$19;
                    case 2:
                        lambda$init$20 = NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$20;
                    case 3:
                        lambda$init$21 = NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$21;
                    case 4:
                        lambda$init$22 = NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$22;
                    case 5:
                        lambda$init$23 = NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$23;
                    case 6:
                        lambda$init$24 = NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$24;
                    case 7:
                        lambda$init$25 = NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$25;
                    case 8:
                        lambda$init$26 = NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$26;
                    case 9:
                        lambda$init$27 = NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$27;
                    case 10:
                        lambda$init$28 = NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$28;
                    case 11:
                        lambda$init$29 = NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$29;
                    case 12:
                        lambda$init$30 = NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$30;
                    case 13:
                        lambda$init$31 = NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$31;
                    case 14:
                        lambda$init$32 = NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$32;
                    case 15:
                        lambda$init$33 = NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$33;
                    case 16:
                        lambda$init$34 = NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$34;
                    case 17:
                        lambda$init$35 = NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$35;
                    case 18:
                        lambda$init$10 = NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$10;
                    case 19:
                        lambda$init$4 = NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$4;
                    case 20:
                        lambda$init$5 = NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$5;
                    case 21:
                        lambda$init$6 = NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$6;
                    case 22:
                        lambda$init$7 = NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$7;
                    case 23:
                        lambda$init$8 = NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$8;
                    case 24:
                        lambda$init$9 = NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$9;
                    case 25:
                        lambda$init$11 = NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$11;
                    case 26:
                        lambda$init$12 = NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$12;
                    case 27:
                        lambda$init$13 = NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$13;
                    case 28:
                        lambda$init$14 = NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$14;
                    default:
                        lambda$init$15 = NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$15;
                }
            }
        }, 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "with", 2, new Callable() { // from class: ry7
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object lambda$init$18;
                Object lambda$init$19;
                Object lambda$init$20;
                Object lambda$init$21;
                Object lambda$init$22;
                Object lambda$init$23;
                Object lambda$init$24;
                Object lambda$init$25;
                Object lambda$init$26;
                Object lambda$init$27;
                Object lambda$init$28;
                Object lambda$init$29;
                Object lambda$init$30;
                Object lambda$init$31;
                Object lambda$init$32;
                Object lambda$init$33;
                Object lambda$init$34;
                Object lambda$init$35;
                Object lambda$init$10;
                Object lambda$init$4;
                Object lambda$init$5;
                Object lambda$init$6;
                Object lambda$init$7;
                Object lambda$init$8;
                Object lambda$init$9;
                Object lambda$init$11;
                Object lambda$init$12;
                Object lambda$init$13;
                Object lambda$init$14;
                Object lambda$init$15;
                int i = r2;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i) {
                    case 0:
                        lambda$init$18 = NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$18;
                    case 1:
                        lambda$init$19 = NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$19;
                    case 2:
                        lambda$init$20 = NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$20;
                    case 3:
                        lambda$init$21 = NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$21;
                    case 4:
                        lambda$init$22 = NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$22;
                    case 5:
                        lambda$init$23 = NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$23;
                    case 6:
                        lambda$init$24 = NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$24;
                    case 7:
                        lambda$init$25 = NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$25;
                    case 8:
                        lambda$init$26 = NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$26;
                    case 9:
                        lambda$init$27 = NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$27;
                    case 10:
                        lambda$init$28 = NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$28;
                    case 11:
                        lambda$init$29 = NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$29;
                    case 12:
                        lambda$init$30 = NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$30;
                    case 13:
                        lambda$init$31 = NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$31;
                    case 14:
                        lambda$init$32 = NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$32;
                    case 15:
                        lambda$init$33 = NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$33;
                    case 16:
                        lambda$init$34 = NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$34;
                    case 17:
                        lambda$init$35 = NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$35;
                    case 18:
                        lambda$init$10 = NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$10;
                    case 19:
                        lambda$init$4 = NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$4;
                    case 20:
                        lambda$init$5 = NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$5;
                    case 21:
                        lambda$init$6 = NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$6;
                    case 22:
                        lambda$init$7 = NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$7;
                    case 23:
                        lambda$init$8 = NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$8;
                    case 24:
                        lambda$init$9 = NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$9;
                    case 25:
                        lambda$init$11 = NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$11;
                    case 26:
                        lambda$init$12 = NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$12;
                    case 27:
                        lambda$init$13 = NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$13;
                    case 28:
                        lambda$init$14 = NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$14;
                    default:
                        lambda$init$15 = NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$15;
                }
            }
        }, 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, SymbolKey.ITERATOR, 0, new Callable() { // from class: ry7
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                Object lambda$init$18;
                Object lambda$init$19;
                Object lambda$init$20;
                Object lambda$init$21;
                Object lambda$init$22;
                Object lambda$init$23;
                Object lambda$init$24;
                Object lambda$init$25;
                Object lambda$init$26;
                Object lambda$init$27;
                Object lambda$init$28;
                Object lambda$init$29;
                Object lambda$init$30;
                Object lambda$init$31;
                Object lambda$init$32;
                Object lambda$init$33;
                Object lambda$init$34;
                Object lambda$init$35;
                Object lambda$init$10;
                Object lambda$init$4;
                Object lambda$init$5;
                Object lambda$init$6;
                Object lambda$init$7;
                Object lambda$init$8;
                Object lambda$init$9;
                Object lambda$init$11;
                Object lambda$init$12;
                Object lambda$init$13;
                Object lambda$init$14;
                Object lambda$init$15;
                int i = r2;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i) {
                    case 0:
                        lambda$init$18 = NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$18;
                    case 1:
                        lambda$init$19 = NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$19;
                    case 2:
                        lambda$init$20 = NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$20;
                    case 3:
                        lambda$init$21 = NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$21;
                    case 4:
                        lambda$init$22 = NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$22;
                    case 5:
                        lambda$init$23 = NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$23;
                    case 6:
                        lambda$init$24 = NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$24;
                    case 7:
                        lambda$init$25 = NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$25;
                    case 8:
                        lambda$init$26 = NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$26;
                    case 9:
                        lambda$init$27 = NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$27;
                    case 10:
                        lambda$init$28 = NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$28;
                    case 11:
                        lambda$init$29 = NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$29;
                    case 12:
                        lambda$init$30 = NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$30;
                    case 13:
                        lambda$init$31 = NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$31;
                    case 14:
                        lambda$init$32 = NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$32;
                    case 15:
                        lambda$init$33 = NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$33;
                    case 16:
                        lambda$init$34 = NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$34;
                    case 17:
                        lambda$init$35 = NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$35;
                    case 18:
                        lambda$init$10 = NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$10;
                    case 19:
                        lambda$init$4 = NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$4;
                    case 20:
                        lambda$init$5 = NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$5;
                    case 21:
                        lambda$init$6 = NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$6;
                    case 22:
                        lambda$init$7 = NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$7;
                    case 23:
                        lambda$init$8 = NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$8;
                    case 24:
                        lambda$init$9 = NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$9;
                    case 25:
                        lambda$init$11 = NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$11;
                    case 26:
                        lambda$init$12 = NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$12;
                    case 27:
                        lambda$init$13 = NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$13;
                    case 28:
                        lambda$init$14 = NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$14;
                    default:
                        lambda$init$15 = NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                        return lambda$init$15;
                }
            }
        }, 2, 3);
    }

    private static Object js_at(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr, RealThis realThis) {
        long j;
        NativeTypedArrayView<?> realThis2 = realThis.realThis(scriptable2);
        if (objArr.length >= 1) {
            j = (long) ScriptRuntime.toInteger(objArr[0]);
        } else {
            j = 0;
        }
        if (j < 0) {
            j += realThis2.length;
        }
        if (j >= 0 && j < realThis2.length) {
            return ScriptableObject.getProperty(scriptable2, (int) j);
        }
        return Undefined.instance;
    }

    private static Object js_buffer(Scriptable scriptable, RealThis realThis) {
        return realThis.realThis(scriptable).arrayBuffer;
    }

    private static Object js_byteLength(Scriptable scriptable, RealThis realThis) {
        return Integer.valueOf(realThis.realThis(scriptable).byteLength);
    }

    private static Object js_byteOffset(Scriptable scriptable, RealThis realThis) {
        return Integer.valueOf(realThis.realThis(scriptable).offset);
    }

    public static NativeTypedArrayView<?> js_constructor(Context context, Scriptable scriptable, Object[] objArr, TypedArrayConstructable typedArrayConstructable, int i) {
        int length;
        int i2 = 0;
        if (!NativeArrayBufferView.isArg(objArr, 0)) {
            return typedArrayConstructable.construct(new NativeArrayBuffer(), 0, 0);
        }
        Object obj = objArr[0];
        if (obj == null) {
            return typedArrayConstructable.construct(new NativeArrayBuffer(), 0, 0);
        }
        if (!(obj instanceof Number) && !(obj instanceof String)) {
            if (obj instanceof NativeTypedArrayView) {
                NativeTypedArrayView nativeTypedArrayView = (NativeTypedArrayView) obj;
                NativeTypedArrayView<?> construct = typedArrayConstructable.construct(makeArrayBuffer(context, scriptable, nativeTypedArrayView.length, i), 0, nativeTypedArrayView.length);
                while (i2 < nativeTypedArrayView.length) {
                    construct.js_set(i2, nativeTypedArrayView.js_get(i2));
                    i2++;
                }
                return construct;
            } else if (obj instanceof NativeArrayBuffer) {
                NativeArrayBuffer nativeArrayBuffer = (NativeArrayBuffer) obj;
                if (NativeArrayBufferView.isArg(objArr, 1)) {
                    i2 = ScriptRuntime.toInt32(objArr[1]);
                }
                if (NativeArrayBufferView.isArg(objArr, 2)) {
                    length = ScriptRuntime.toInt32(objArr[2]) * i;
                } else {
                    length = nativeArrayBuffer.getLength() - i2;
                }
                if (i2 >= 0 && i2 <= nativeArrayBuffer.getLength()) {
                    if (length >= 0 && i2 + length <= nativeArrayBuffer.getLength()) {
                        if (i2 % i == 0) {
                            if (length % i == 0) {
                                return typedArrayConstructable.construct(nativeArrayBuffer, i2, length / i);
                            }
                            throw ScriptRuntime.rangeError(ScriptRuntime.getMessageById("msg.typed.array.bad.buffer.length.byte.size", Integer.valueOf(length), Integer.valueOf(i)));
                        }
                        throw ScriptRuntime.rangeError(ScriptRuntime.getMessageById("msg.typed.array.bad.offset.byte.size", Integer.valueOf(i2), Integer.valueOf(i)));
                    }
                    throw ScriptRuntime.rangeError(ScriptRuntime.getMessageById("msg.typed.array.bad.length", Integer.valueOf(length)));
                }
                throw ScriptRuntime.rangeError(ScriptRuntime.getMessageById("msg.typed.array.bad.offset", Integer.valueOf(i2)));
            } else if (obj instanceof NativeArray) {
                NativeArray nativeArray = (NativeArray) obj;
                NativeTypedArrayView<?> construct2 = typedArrayConstructable.construct(makeArrayBuffer(context, scriptable, nativeArray.size(), i), 0, nativeArray.size());
                while (i2 < nativeArray.size()) {
                    Object obj2 = nativeArray.get(i2, nativeArray);
                    if (obj2 != Scriptable.NOT_FOUND && obj2 != Undefined.instance) {
                        if (obj2 instanceof Wrapper) {
                            construct2.js_set(i2, ((Wrapper) obj2).unwrap());
                        } else {
                            construct2.js_set(i2, obj2);
                        }
                    } else {
                        construct2.js_set(i2, ScriptRuntime.NaNobj);
                    }
                    i2++;
                }
                return construct2;
            } else if (ScriptRuntime.isArrayObject(obj)) {
                Object[] arrayElements = ScriptRuntime.getArrayElements((Scriptable) obj);
                NativeTypedArrayView<?> construct3 = typedArrayConstructable.construct(makeArrayBuffer(context, scriptable, arrayElements.length, i), 0, arrayElements.length);
                while (i2 < arrayElements.length) {
                    construct3.js_set(i2, arrayElements[i2]);
                    i2++;
                }
                return construct3;
            } else {
                throw ScriptRuntime.constructError("Error", "invalid argument");
            }
        }
        int int32 = ScriptRuntime.toInt32(obj);
        return typedArrayConstructable.construct(makeArrayBuffer(context, scriptable, int32, i), 0, int32);
    }

    private static Object js_copyWithin(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr, RealThis realThis) {
        Object obj;
        long min;
        Object obj2;
        long min2;
        long min3;
        NativeTypedArrayView<?> realThis2 = realThis.realThis(scriptable2);
        int i = 1;
        if (objArr.length >= 1) {
            obj = objArr[0];
        } else {
            obj = Undefined.instance;
        }
        long integer = (long) ScriptRuntime.toInteger(obj);
        if (integer < 0) {
            min = Math.max(realThis2.length + integer, 0L);
        } else {
            min = Math.min(integer, realThis2.length);
        }
        if (objArr.length >= 2) {
            obj2 = objArr[1];
        } else {
            obj2 = Undefined.instance;
        }
        long integer2 = (long) ScriptRuntime.toInteger(obj2);
        if (integer2 < 0) {
            min2 = Math.max(realThis2.length + integer2, 0L);
        } else {
            min2 = Math.min(integer2, realThis2.length);
        }
        long j = realThis2.length;
        if (objArr.length >= 3 && !Undefined.isUndefined(objArr[2])) {
            j = (long) ScriptRuntime.toInteger(objArr[2]);
        }
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i3 = realThis2.length;
        if (i2 < 0) {
            min3 = Math.max(i3 + j, 0L);
        } else {
            min3 = Math.min(j, i3);
        }
        long min4 = Math.min(min3 - min2, realThis2.length - min);
        if (min2 < min) {
            long j2 = min2 + min4;
            if (min < j2) {
                min2 = j2 - 1;
                min = (min + min4) - 1;
                i = -1;
            }
        }
        while (min4 > 0) {
            realThis2.js_set((int) min, realThis2.js_get((int) min2));
            long j3 = i;
            min2 += j3;
            min += j3;
            min4--;
        }
        return realThis2;
    }

    private static NativeTypedArrayView<?> js_fill(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr, RealThis realThis) {
        long j;
        long min;
        long min2;
        Object obj;
        NativeTypedArrayView<?> realThis2 = realThis.realThis(scriptable2);
        if (objArr.length >= 2) {
            j = (long) ScriptRuntime.toInteger(objArr[1]);
        } else {
            j = 0;
        }
        if (j < 0) {
            min = Math.max(realThis2.length + j, 0L);
        } else {
            min = Math.min(j, realThis2.length);
        }
        long j2 = realThis2.length;
        if (objArr.length >= 3 && !Undefined.isUndefined(objArr[2])) {
            j2 = (long) ScriptRuntime.toInteger(objArr[2]);
        }
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        int i2 = realThis2.length;
        if (i < 0) {
            min2 = Math.max(i2 + j2, 0L);
        } else {
            min2 = Math.min(j2, i2);
        }
        if (objArr.length > 0) {
            obj = objArr[0];
        } else {
            obj = Undefined.instance;
        }
        for (int i3 = (int) min; i3 < min2; i3++) {
            realThis2.js_set(i3, obj);
        }
        return realThis2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
        if (r7 < 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Boolean js_includes(org.mozilla.javascript.Context r4, org.mozilla.javascript.Scriptable r5, org.mozilla.javascript.Scriptable r6, java.lang.Object[] r7, org.mozilla.javascript.typedarrays.NativeTypedArrayView.RealThis r8) {
        /*
            org.mozilla.javascript.typedarrays.NativeTypedArrayView r4 = r8.realThis(r6)
            int r5 = r7.length
            if (r5 <= 0) goto Lb
            r5 = 0
            r5 = r7[r5]
            goto Ld
        Lb:
            java.lang.Object r5 = org.mozilla.javascript.Undefined.instance
        Ld:
            int r6 = r4.length
            if (r6 != 0) goto L14
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L14:
            int r6 = r7.length
            r8 = 2
            r0 = 0
            if (r6 >= r8) goto L1b
            goto L3c
        L1b:
            r6 = 1
            r7 = r7[r6]
            double r7 = org.mozilla.javascript.ScriptRuntime.toInteger(r7)
            long r7 = (long) r7
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 >= 0) goto L30
            int r2 = r4.length
            long r2 = (long) r2
            long r7 = r7 + r2
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 >= 0) goto L30
            goto L31
        L30:
            r0 = r7
        L31:
            int r7 = r4.length
            int r7 = r7 - r6
            long r6 = (long) r7
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 <= 0) goto L3c
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L3c:
            int r6 = (int) r0
        L3d:
            int r7 = r4.length
            if (r6 >= r7) goto L51
            java.lang.Object r7 = r4.js_get(r6)
            boolean r7 = org.mozilla.javascript.ScriptRuntime.sameZero(r7, r5)
            if (r7 == 0) goto L4e
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L4e:
            int r6 = r6 + 1
            goto L3d
        L51:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.typedarrays.NativeTypedArrayView.js_includes(org.mozilla.javascript.Context, org.mozilla.javascript.Scriptable, org.mozilla.javascript.Scriptable, java.lang.Object[], org.mozilla.javascript.typedarrays.NativeTypedArrayView$RealThis):java.lang.Boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r3 < 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
        if (r1 > (r8.length - 1)) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Object js_indexOf(org.mozilla.javascript.Context r7, org.mozilla.javascript.Scriptable r8, org.mozilla.javascript.Scriptable r9, java.lang.Object[] r10, org.mozilla.javascript.typedarrays.NativeTypedArrayView.RealThis r11) {
        /*
            r7 = -1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            org.mozilla.javascript.typedarrays.NativeTypedArrayView r8 = r11.realThis(r9)
            int r9 = r10.length
            if (r9 <= 0) goto L10
            r9 = 0
            r9 = r10[r9]
            goto L12
        L10:
            java.lang.Object r9 = org.mozilla.javascript.Undefined.instance
        L12:
            int r11 = r8.length
            if (r11 != 0) goto L17
            goto L59
        L17:
            int r11 = r10.length
            r0 = 2
            r1 = 0
            if (r11 >= r0) goto L1e
            goto L3d
        L1e:
            r11 = 1
            r10 = r10[r11]
            double r3 = org.mozilla.javascript.ScriptRuntime.toInteger(r10)
            long r3 = (long) r3
            int r10 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r10 >= 0) goto L33
            int r10 = r8.length
            long r5 = (long) r10
            long r3 = r3 + r5
            int r10 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r10 >= 0) goto L33
            goto L34
        L33:
            r1 = r3
        L34:
            int r10 = r8.length
            int r10 = r10 - r11
            long r10 = (long) r10
            int r10 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r10 <= 0) goto L3d
            goto L59
        L3d:
            int r10 = (int) r1
        L3e:
            int r11 = r8.length
            if (r10 >= r11) goto L59
            java.lang.Object r11 = r8.js_get(r10)
            java.lang.Object r0 = org.mozilla.javascript.Scriptable.NOT_FOUND
            if (r11 == r0) goto L56
            boolean r11 = org.mozilla.javascript.ScriptRuntime.shallowEq(r11, r9)
            if (r11 == 0) goto L56
            long r7 = (long) r10
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            return r7
        L56:
            int r10 = r10 + 1
            goto L3e
        L59:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.typedarrays.NativeTypedArrayView.js_indexOf(org.mozilla.javascript.Context, org.mozilla.javascript.Scriptable, org.mozilla.javascript.Scriptable, java.lang.Object[], org.mozilla.javascript.typedarrays.NativeTypedArrayView$RealThis):java.lang.Object");
    }

    private static String js_join(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr, RealThis realThis) {
        String str;
        int i;
        Object obj;
        NativeTypedArrayView<?> realThis2 = realThis.realThis(scriptable2);
        if (objArr.length >= 1 && (obj = objArr[0]) != Undefined.instance) {
            str = ScriptRuntime.toString(obj);
        } else {
            str = ",";
        }
        int i2 = realThis2.length;
        if (i2 == 0) {
            return "";
        }
        String[] strArr = new String[i2];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = realThis2.length;
            if (i3 == i) {
                break;
            }
            Object js_get = realThis2.js_get(i3);
            if (js_get != null && js_get != Undefined.instance) {
                String scriptRuntime = ScriptRuntime.toString(js_get);
                i4 += scriptRuntime.length();
                strArr[i3] = scriptRuntime;
            }
            i3++;
        }
        StringBuilder sb = new StringBuilder((str.length() * (i - 1)) + i4);
        for (int i5 = 0; i5 != realThis2.length; i5++) {
            if (i5 != 0) {
                sb.append(str);
            }
            String str2 = strArr[i5];
            if (str2 != null) {
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
        if (r10 < 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Object js_lastIndexOf(org.mozilla.javascript.Context r7, org.mozilla.javascript.Scriptable r8, org.mozilla.javascript.Scriptable r9, java.lang.Object[] r10, org.mozilla.javascript.typedarrays.NativeTypedArrayView.RealThis r11) {
        /*
            r7 = -1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            org.mozilla.javascript.typedarrays.NativeTypedArrayView r8 = r11.realThis(r9)
            int r9 = r10.length
            if (r9 <= 0) goto L10
            r9 = 0
            r9 = r10[r9]
            goto L12
        L10:
            java.lang.Object r9 = org.mozilla.javascript.Undefined.instance
        L12:
            int r11 = r8.length
            if (r11 != 0) goto L17
            goto L58
        L17:
            int r0 = r10.length
            r1 = 2
            r2 = 1
            if (r0 >= r1) goto L20
            long r10 = (long) r11
            long r10 = r10 - r2
            goto L3e
        L20:
            r11 = 1
            r10 = r10[r11]
            double r10 = org.mozilla.javascript.ScriptRuntime.toInteger(r10)
            long r10 = (long) r10
            int r0 = r8.length
            long r0 = (long) r0
            int r4 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r5 = 0
            if (r4 < 0) goto L34
            long r0 = r0 - r2
            r10 = r0
            goto L39
        L34:
            int r2 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r2 >= 0) goto L39
            long r10 = r10 + r0
        L39:
            int r0 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r0 >= 0) goto L3e
            goto L58
        L3e:
            int r10 = (int) r10
        L3f:
            if (r10 < 0) goto L58
            java.lang.Object r11 = r8.js_get(r10)
            java.lang.Object r0 = org.mozilla.javascript.Scriptable.NOT_FOUND
            if (r11 == r0) goto L55
            boolean r11 = org.mozilla.javascript.ScriptRuntime.shallowEq(r11, r9)
            if (r11 == 0) goto L55
            long r7 = (long) r10
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            return r7
        L55:
            int r10 = r10 + (-1)
            goto L3f
        L58:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.typedarrays.NativeTypedArrayView.js_lastIndexOf(org.mozilla.javascript.Context, org.mozilla.javascript.Scriptable, org.mozilla.javascript.Scriptable, java.lang.Object[], org.mozilla.javascript.typedarrays.NativeTypedArrayView$RealThis):java.lang.Object");
    }

    private static Object js_length(Scriptable scriptable, RealThis realThis) {
        return Integer.valueOf(realThis.realThis(scriptable).length);
    }

    private static NativeTypedArrayView<?> js_reverse(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr, RealThis realThis) {
        NativeTypedArrayView<?> realThis2 = realThis.realThis(scriptable2);
        int i = 0;
        for (int i2 = realThis2.length - 1; i < i2; i2--) {
            Object js_get = realThis2.js_get(i);
            realThis2.js_set(i, realThis2.js_get(i2));
            realThis2.js_set(i2, js_get);
            i++;
        }
        return realThis2;
    }

    private static Object js_set(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr, RealThis realThis) {
        int i;
        int i2;
        NativeTypedArrayView<?> realThis2 = realThis.realThis(scriptable2);
        if (objArr.length > 0) {
            Object obj = objArr[0];
            if (obj instanceof NativeTypedArrayView) {
                if (NativeArrayBufferView.isArg(objArr, 1)) {
                    i2 = ScriptRuntime.toInt32(objArr[1]);
                } else {
                    i2 = 0;
                }
                realThis2.setRange((NativeTypedArrayView) objArr[0], i2);
                return Undefined.instance;
            } else if (obj instanceof NativeArray) {
                if (NativeArrayBufferView.isArg(objArr, 1)) {
                    i = ScriptRuntime.toInt32(objArr[1]);
                } else {
                    i = 0;
                }
                realThis2.setRange((NativeArray) objArr[0], i);
                return Undefined.instance;
            } else if (obj instanceof Scriptable) {
                return Undefined.instance;
            } else {
                if (NativeArrayBufferView.isArg(objArr, 2)) {
                    return realThis2.js_set(ScriptRuntime.toInt32(objArr[0]), objArr[1]);
                }
            }
        }
        throw ScriptRuntime.constructError("Error", "invalid arguments");
    }

    private static Scriptable js_slice(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr, RealThis realThis) {
        long sliceIndex;
        long j;
        Object obj;
        NativeTypedArrayView<?> realThis2 = realThis.realThis(scriptable2);
        if (objArr.length == 0) {
            j = realThis2.length;
            sliceIndex = 0;
        } else {
            sliceIndex = ArrayLikeAbstractOperations.toSliceIndex(ScriptRuntime.toInteger(objArr[0]), realThis2.length);
            if (objArr.length != 1 && (obj = objArr[1]) != Undefined.instance) {
                j = ArrayLikeAbstractOperations.toSliceIndex(ScriptRuntime.toInteger(obj), realThis2.length);
            } else {
                j = realThis2.length;
            }
        }
        long j2 = j - sliceIndex;
        if (j2 <= 2147483647L) {
            Math.max(j2, 0L);
            return realThis2.typedArraySpeciesCreate(context, scriptable, new Object[]{realThis2.arrayBuffer, Long.valueOf(sliceIndex * realThis2.getBytesPerElement()), Long.valueOf(Math.max(0L, j2))}, "slice");
        }
        throw ScriptRuntime.rangeError(ScriptRuntime.getMessageById("msg.arraylength.bad", new Object[0]));
    }

    private static Scriptable js_sort(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr, RealThis realThis) {
        if (NativeArrayBufferView.isArg(objArr, 0) && !(objArr[0] instanceof Callable)) {
            throw ScriptRuntime.typeErrorById("msg.function.expected", new Object[0]);
        }
        NativeTypedArrayView<?> realThis2 = realThis.realThis(scriptable2);
        Object[] sortTemporaryArray = realThis2.sortTemporaryArray(context, scriptable, objArr);
        for (int i = 0; i < realThis2.length; i++) {
            realThis2.js_set(i, sortTemporaryArray[i]);
        }
        return realThis2;
    }

    private static Object js_subarray(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr, RealThis realThis) {
        int i;
        int i2;
        NativeTypedArrayView<?> realThis2 = realThis.realThis(scriptable2);
        if (NativeArrayBufferView.isArg(objArr, 0)) {
            i = ScriptRuntime.toInt32(objArr[0]);
        } else {
            i = 0;
        }
        if (NativeArrayBufferView.isArg(objArr, 1)) {
            i2 = ScriptRuntime.toInt32(objArr[1]);
        } else {
            i2 = realThis2.length;
        }
        if (context.getLanguageVersion() < 200 && objArr.length <= 0) {
            throw ScriptRuntime.constructError("Error", "invalid arguments");
        }
        if (i < 0) {
            i += realThis2.length;
        }
        if (i2 < 0) {
            i2 += realThis2.length;
        }
        int max = Math.max(0, i);
        return context.newObject(scriptable, realThis2.getClassName(), new Object[]{realThis2.arrayBuffer, Integer.valueOf(Math.min((realThis2.getBytesPerElement() * max) + realThis2.getByteOffset(), realThis2.arrayBuffer.getLength())), Integer.valueOf(Math.max(0, Math.min(realThis2.length, i2) - max))});
    }

    private static Object js_toReversed(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr, RealThis realThis) {
        NativeTypedArrayView<?> realThis2 = realThis.realThis(scriptable2);
        int i = 0;
        Scriptable newObject = context.newObject(scriptable, realThis2.getClassName(), new Object[]{new NativeArrayBuffer(realThis2.getBytesPerElement() * realThis2.length), 0, Integer.valueOf(realThis2.length), Integer.valueOf(realThis2.getBytesPerElement())});
        while (true) {
            int i2 = realThis2.length;
            if (i < i2) {
                newObject.put(i, newObject, realThis2.js_get((i2 - i) - 1));
                i++;
            } else {
                return newObject;
            }
        }
    }

    private static Object js_toSorted(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr, RealThis realThis) {
        NativeTypedArrayView<?> realThis2 = realThis.realThis(scriptable2);
        Object[] sortTemporaryArray = realThis2.sortTemporaryArray(context, scriptable, objArr);
        Scriptable newObject = context.newObject(scriptable, realThis2.getClassName(), new Object[]{new NativeArrayBuffer(realThis2.getBytesPerElement() * realThis2.length), 0, Integer.valueOf(realThis2.length), Integer.valueOf(realThis2.getBytesPerElement())});
        for (int i = 0; i < realThis2.length; i++) {
            newObject.put(i, newObject, sortTemporaryArray[i]);
        }
        return newObject;
    }

    private static String js_toString(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr, RealThis realThis, boolean z) {
        NativeTypedArrayView<?> realThis2 = realThis.realThis(scriptable2);
        StringBuilder sb = new StringBuilder();
        if (realThis2.length > 0) {
            sb.append(ScriptRuntime.toString(realThis2.getElemForToString(context, scriptable, 0, z)));
        }
        for (int i = 1; i < realThis2.length; i++) {
            sb.append(',');
            sb.append(ScriptRuntime.toString(realThis2.getElemForToString(context, scriptable, i, z)));
        }
        return sb.toString();
    }

    private static Object js_with(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr, RealThis realThis) {
        long j;
        long j2;
        double d;
        int i;
        Object js_get;
        NativeTypedArrayView<?> realThis2 = realThis.realThis(scriptable2);
        if (objArr.length > 0) {
            j = (int) ScriptRuntime.toInteger(objArr[0]);
        } else {
            j = 0;
        }
        if (j >= 0) {
            j2 = j;
        } else {
            j2 = realThis2.length + j;
        }
        if (objArr.length > 1) {
            d = ScriptRuntime.toNumber(objArr[1]);
        } else {
            d = 0.0d;
        }
        Double valueOf = Double.valueOf(d);
        if (j2 >= 0) {
            if (j2 < realThis2.length) {
                Scriptable newObject = context.newObject(scriptable, realThis2.getClassName(), new Object[]{new NativeArrayBuffer(realThis2.getBytesPerElement() * i), 0, Integer.valueOf(realThis2.length), Integer.valueOf(realThis2.getBytesPerElement())});
                for (int i2 = 0; i2 < realThis2.length; i2++) {
                    if (i2 == j2) {
                        js_get = valueOf;
                    } else {
                        js_get = realThis2.js_get(i2);
                    }
                    newObject.put(i2, newObject, js_get);
                }
                return newObject;
            }
        }
        throw ScriptRuntime.rangeError(ScriptRuntime.getMessageById("msg.typed.array.index.out.of.bounds", Long.valueOf(j), Integer.valueOf(realThis2.length * (-1)), Integer.valueOf(realThis2.length - 1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$0(RealThis realThis, Scriptable scriptable) {
        return js_buffer(scriptable, realThis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$1(RealThis realThis, Scriptable scriptable) {
        return js_byteLength(scriptable, realThis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$10(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ArrayLikeAbstractOperations.iterativeMethod(context, ArrayLikeAbstractOperations.IterativeOperation.FIND, scriptable, realThis.realThis(scriptable2), objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$11(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ArrayLikeAbstractOperations.iterativeMethod(context, ArrayLikeAbstractOperations.IterativeOperation.FIND_INDEX, scriptable, realThis.realThis(scriptable2), objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$12(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ArrayLikeAbstractOperations.iterativeMethod(context, ArrayLikeAbstractOperations.IterativeOperation.FIND_LAST, scriptable, realThis.realThis(scriptable2), objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$13(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ArrayLikeAbstractOperations.iterativeMethod(context, ArrayLikeAbstractOperations.IterativeOperation.FIND_LAST_INDEX, scriptable, realThis.realThis(scriptable2), objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$14(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ArrayLikeAbstractOperations.iterativeMethod(context, ArrayLikeAbstractOperations.IterativeOperation.FOR_EACH, scriptable, realThis.realThis(scriptable2), objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$15(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return js_includes(context, scriptable, scriptable2, objArr, realThis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$16(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return js_indexOf(context, scriptable, scriptable2, objArr, realThis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$17(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return js_join(context, scriptable, scriptable2, objArr, realThis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$18(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return new NativeArrayIterator(scriptable, realThis.realThis(scriptable2), NativeArrayIterator.ARRAY_ITERATOR_TYPE.KEYS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$19(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return js_lastIndexOf(context, scriptable, scriptable2, objArr, realThis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$2(RealThis realThis, Scriptable scriptable) {
        return js_byteOffset(scriptable, realThis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$20(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return realThis.realThis(scriptable2).typedArraySpeciesCreate(context, scriptable, new Object[]{ArrayLikeAbstractOperations.iterativeMethod(context, ArrayLikeAbstractOperations.IterativeOperation.MAP, scriptable, scriptable2, objArr)}, "map");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$21(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ArrayLikeAbstractOperations.reduceMethod(context, ArrayLikeAbstractOperations.ReduceOperation.REDUCE, scriptable, realThis.realThis(scriptable2), objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$22(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ArrayLikeAbstractOperations.reduceMethod(context, ArrayLikeAbstractOperations.ReduceOperation.REDUCE_RIGHT, scriptable, realThis.realThis(scriptable2), objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$23(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return js_reverse(context, scriptable, scriptable2, objArr, realThis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$24(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return js_set(context, scriptable, scriptable2, objArr, realThis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$25(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return js_slice(context, scriptable, scriptable2, objArr, realThis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$26(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ArrayLikeAbstractOperations.iterativeMethod(context, ArrayLikeAbstractOperations.IterativeOperation.SOME, scriptable, realThis.realThis(scriptable2), objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$27(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return js_sort(context, scriptable, scriptable2, objArr, realThis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$28(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return js_subarray(context, scriptable, scriptable2, objArr, realThis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$29(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return js_toString(context, scriptable, scriptable2, objArr, realThis, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$3(RealThis realThis, Scriptable scriptable) {
        return js_length(scriptable, realThis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$30(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return js_toReversed(context, scriptable, scriptable2, objArr, realThis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$31(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return js_toSorted(context, scriptable, scriptable2, objArr, realThis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$32(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return js_toString(context, scriptable, scriptable2, objArr, realThis, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$33(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return new NativeArrayIterator(scriptable, realThis.realThis(scriptable2), NativeArrayIterator.ARRAY_ITERATOR_TYPE.VALUES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$34(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return js_with(context, scriptable, scriptable2, objArr, realThis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$35(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return new NativeArrayIterator(scriptable, realThis.realThis(scriptable2), NativeArrayIterator.ARRAY_ITERATOR_TYPE.VALUES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$4(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return js_at(context, scriptable, scriptable2, objArr, realThis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$5(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return js_copyWithin(context, scriptable, scriptable2, objArr, realThis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$6(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return new NativeArrayIterator(scriptable, realThis.realThis(scriptable2), NativeArrayIterator.ARRAY_ITERATOR_TYPE.ENTRIES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$7(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ArrayLikeAbstractOperations.iterativeMethod(context, ArrayLikeAbstractOperations.IterativeOperation.EVERY, scriptable, realThis.realThis(scriptable2), objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$8(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return js_fill(context, scriptable, scriptable2, objArr, realThis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$9(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        NativeTypedArrayView<?> realThis2 = realThis.realThis(scriptable2);
        return realThis2.typedArraySpeciesCreate(context, scriptable, new Object[]{ArrayLikeAbstractOperations.iterativeMethod(context, ArrayLikeAbstractOperations.IterativeOperation.FILTER, scriptable, realThis2, objArr)}, "filter");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ double lambda$sortTemporaryArray$36(Object obj) {
        return ((Number) obj).doubleValue();
    }

    private static NativeArrayBuffer makeArrayBuffer(Context context, Scriptable scriptable, int i, int i2) {
        return (NativeArrayBuffer) context.newObject(scriptable, NativeArrayBuffer.CLASS_NAME, new Object[]{Double.valueOf(i * i2)});
    }

    private void setRange(NativeTypedArrayView<?> nativeTypedArrayView, int i) {
        int i2;
        if (i >= 0 && i <= (i2 = this.length)) {
            int i3 = nativeTypedArrayView.length;
            int i4 = 0;
            if (i3 <= i2 - i) {
                if (nativeTypedArrayView.arrayBuffer == this.arrayBuffer) {
                    Object[] objArr = new Object[i3];
                    for (int i5 = 0; i5 < nativeTypedArrayView.length; i5++) {
                        objArr[i5] = nativeTypedArrayView.js_get(i5);
                    }
                    while (i4 < nativeTypedArrayView.length) {
                        js_set(i4 + i, objArr[i4]);
                        i4++;
                    }
                    return;
                }
                while (i4 < nativeTypedArrayView.length) {
                    js_set(i4 + i, nativeTypedArrayView.js_get(i4));
                    i4++;
                }
                return;
            }
            throw ScriptRuntime.rangeError(ScriptRuntime.getMessageById("msg.typed.array.bad.source.array", new Object[0]));
        }
        throw ScriptRuntime.rangeError(ScriptRuntime.getMessageById("msg.typed.array.bad.offset", Integer.valueOf(i)));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.function.ToDoubleFunction, java.lang.Object] */
    private Object[] sortTemporaryArray(Context context, Scriptable scriptable, Object[] objArr) {
        Comparator<Object> comparingDouble;
        if (objArr.length > 0 && Undefined.instance != objArr[0]) {
            comparingDouble = ArrayLikeAbstractOperations.getSortComparator(context, scriptable, objArr);
        } else {
            comparingDouble = Comparator.comparingDouble(new Object());
        }
        Object[] array = toArray();
        Arrays.sort(array, comparingDouble);
        return array;
    }

    private static int toIndex(double d) {
        int i = (int) d;
        if (i == d && i >= 0) {
            return i;
        }
        return -1;
    }

    private Scriptable typedArraySpeciesCreate(Context context, Scriptable scriptable, Object[] objArr, String str) {
        Scriptable construct = AbstractEcmaObjectOperations.speciesConstructor(context, this, ScriptRuntime.getExistingCtor(context, ScriptableObject.getTopLevelScope(scriptable), getClassName())).construct(context, scriptable, objArr);
        if (construct instanceof NativeTypedArrayView) {
            return construct;
        }
        throw ScriptRuntime.typeErrorById("msg.typed.array.ctor.incompatible", str);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException();
    }

    public boolean checkIndex(int i) {
        if (i >= 0 && i < this.length) {
            return false;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public void delete(String str) {
        if (!ScriptRuntime.canonicalNumericIndexString(str).isPresent()) {
            super.delete(str);
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof NativeTypedArrayView)) {
            return false;
        }
        NativeTypedArrayView nativeTypedArrayView = (NativeTypedArrayView) obj;
        if (this.length != nativeTypedArrayView.length) {
            return false;
        }
        for (int i = 0; i < this.length; i++) {
            if (!js_get(i).equals(nativeTypedArrayView.js_get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public Object get(String str, Scriptable scriptable) {
        int index;
        Optional<Double> canonicalNumericIndexString = ScriptRuntime.canonicalNumericIndexString(str);
        if (canonicalNumericIndexString.isPresent() && (index = toIndex(canonicalNumericIndexString.get().doubleValue())) >= 0) {
            return js_get(index);
        }
        return super.get(str, scriptable);
    }

    @Override // org.mozilla.javascript.ExternalArrayData
    public Object getArrayElement(int i) {
        return js_get(i);
    }

    @Override // org.mozilla.javascript.ExternalArrayData
    public int getArrayLength() {
        return this.length;
    }

    public abstract int getBytesPerElement();

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public Object[] getIds() {
        Object[] objArr = new Object[this.length];
        for (int i = 0; i < this.length; i++) {
            objArr[i] = Integer.valueOf(i);
        }
        return objArr;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public boolean has(String str, Scriptable scriptable) {
        int index;
        Optional<Double> canonicalNumericIndexString = ScriptRuntime.canonicalNumericIndexString(str);
        if (canonicalNumericIndexString.isPresent() && (index = toIndex(canonicalNumericIndexString.get().doubleValue())) >= 0) {
            return !checkIndex(index);
        }
        return super.has(str, scriptable);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < this.length; i2++) {
            i += js_get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        for (int i = 0; i < this.length; i++) {
            if (obj.equals(js_get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // org.mozilla.javascript.ScriptableObject, java.util.List, java.util.Collection
    public boolean isEmpty() {
        if (this.length == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return new NativeTypedArrayIterator(this, 0);
    }

    public abstract Object js_get(int i);

    public abstract Object js_set(int i, Object obj);

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        for (int i = this.length - 1; i >= 0; i--) {
            if (obj.equals(js_get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int i) {
        if (!checkIndex(i)) {
            return new NativeTypedArrayIterator(this, i);
        }
        xk5.r();
        return null;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public void put(String str, Scriptable scriptable, Object obj) {
        Optional<Double> canonicalNumericIndexString = ScriptRuntime.canonicalNumericIndexString(str);
        if (canonicalNumericIndexString.isPresent()) {
            int index = toIndex(canonicalNumericIndexString.get().doubleValue());
            if (index >= 0) {
                js_set(index, obj);
                return;
            }
            return;
        }
        super.put(str, scriptable, obj);
    }

    @Override // java.util.List
    public T remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // org.mozilla.javascript.ExternalArrayData
    public void setArrayElement(int i, Object obj) {
        js_set(i, obj);
    }

    @Override // org.mozilla.javascript.ScriptableObject, java.util.List, java.util.Collection
    public int size() {
        return this.length;
    }

    @Override // java.util.List
    public List<T> subList(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List, java.util.Collection
    public <U> U[] toArray(U[] uArr) {
        if (uArr.length < this.length) {
            uArr = (U[]) ((Object[]) Array.newInstance(uArr.getClass().getComponentType(), this.length));
        }
        for (int i = 0; i < this.length; i++) {
            try {
                uArr[i] = js_get(i);
            } catch (ClassCastException unused) {
                throw new ArrayStoreException();
            }
        }
        return uArr;
    }

    @Override // java.util.List
    public void add(int i, T t) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends T> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public NativeTypedArrayView(NativeArrayBuffer nativeArrayBuffer, int i, int i2, int i3) {
        super(nativeArrayBuffer, i, i3);
        this.length = i2;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public void delete(int i) {
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return new NativeTypedArrayIterator(this, 0);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public void put(int i, Scriptable scriptable, Object obj) {
        js_set(i, obj);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public Object get(int i, Scriptable scriptable) {
        return js_get(i);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public boolean has(int i, Scriptable scriptable) {
        return !checkIndex(i);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        Object[] objArr = new Object[this.length];
        for (int i = 0; i < this.length; i++) {
            objArr[i] = js_get(i);
        }
        return objArr;
    }

    private void setRange(NativeArray nativeArray, int i) {
        if (i >= 0 && i <= this.length) {
            if (nativeArray.size() + i <= this.length) {
                Iterator it = nativeArray.iterator();
                while (it.hasNext()) {
                    js_set(i, it.next());
                    i++;
                }
                return;
            }
            throw ScriptRuntime.rangeError(ScriptRuntime.getMessageById("msg.typed.array.bad.source.array", new Object[0]));
        }
        throw ScriptRuntime.rangeError(ScriptRuntime.getMessageById("msg.typed.array.bad.offset", Integer.valueOf(i)));
    }
}
