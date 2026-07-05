package org.mozilla.javascript;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Callable {
    public final /* synthetic */ int a;

    public /* synthetic */ j(int i) {
        this.a = i;
    }

    @Override // org.mozilla.javascript.Callable
    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Object revocable;
        switch (this.a) {
            case 0:
                return NativeMath.M(context, scriptable, scriptable2, objArr);
            case 1:
                return NativeMath.O(context, scriptable, scriptable2, objArr);
            case 2:
                return NativeMath.L(context, scriptable, scriptable2, objArr);
            case 3:
                return NativeMath.N(context, scriptable, scriptable2, objArr);
            case 4:
                return NativeMath.A(context, scriptable, scriptable2, objArr);
            case 5:
                revocable = NativeProxy.revocable(context, scriptable, scriptable2, objArr);
                return revocable;
            case 6:
                return NativeReflect.r(context, scriptable, scriptable2, objArr);
            case 7:
                return NativeReflect.l(context, scriptable, scriptable2, objArr);
            case 8:
                return NativeReflect.m(context, scriptable, scriptable2, objArr);
            case 9:
                return NativeReflect.i(context, scriptable, scriptable2, objArr);
            case 10:
                return NativeReflect.g(context, scriptable, scriptable2, objArr);
            case 11:
                return NativeReflect.u(context, scriptable, scriptable2, objArr);
            case 12:
                return NativeReflect.t(context, scriptable, scriptable2, objArr);
            case 13:
                return NativeReflect.s(context, scriptable, scriptable2, objArr);
            case 14:
                return NativeReflect.n(context, scriptable, scriptable2, objArr);
            case 15:
                return NativeReflect.p(context, scriptable, scriptable2, objArr);
            case 16:
                return NativeReflect.h(context, scriptable, scriptable2, objArr);
            case 17:
                return NativeReflect.k(context, scriptable, scriptable2, objArr);
            default:
                return NativeReflect.j(context, scriptable, scriptable2, objArr);
        }
    }
}
