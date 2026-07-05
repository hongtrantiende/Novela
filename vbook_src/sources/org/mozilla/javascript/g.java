package org.mozilla.javascript;

import java.io.Serializable;
import java.util.function.Supplier;
import org.mozilla.javascript.NativeError;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;

    public /* synthetic */ g(int i, Serializable serializable) {
        this.a = i;
        this.b = serializable;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.a;
        Serializable serializable = this.b;
        switch (i) {
            case 0:
                return ((NativeError.ProtoProps) serializable).getStackTraceLimit();
            case 1:
                return ((NativeError.ProtoProps) serializable).getPrepareStackTrace();
            default:
                return ((NativeError) serializable).getStackDelegated();
        }
    }
}
