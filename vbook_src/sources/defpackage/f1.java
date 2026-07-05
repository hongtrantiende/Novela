package defpackage;

import java.util.function.Function;
import org.mozilla.javascript.AbstractEcmaObjectOperations;
import org.mozilla.javascript.NativeConsole;
import org.mozilla.javascript.NativeSymbol;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeDataView;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f1  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class f1 implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ f1(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return AbstractEcmaObjectOperations.a(obj);
            case 1:
                return Integer.valueOf(Integer.bitCount(((Integer) obj).intValue()));
            case 2:
                return NativeArrayBuffer.i((Scriptable) obj);
            case 3:
                return NativeConsole.g((String) obj);
            case 4:
                return NativeDataView.u((Scriptable) obj);
            case 5:
                return NativeDataView.l((Scriptable) obj);
            case 6:
                return NativeDataView.j((Scriptable) obj);
            default:
                return NativeSymbol.l((Scriptable) obj);
        }
    }
}
