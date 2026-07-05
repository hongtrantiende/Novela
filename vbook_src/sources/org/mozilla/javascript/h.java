package org.mozilla.javascript;

import java.io.Serializable;
import java.util.function.Consumer;
import org.mozilla.javascript.NativeError;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;

    public /* synthetic */ h(int i, Serializable serializable) {
        this.a = i;
        this.b = serializable;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        Serializable serializable = this.b;
        switch (i) {
            case 0:
                ((NativeError.ProtoProps) serializable).setStackTraceLimit(obj);
                return;
            case 1:
                ((NativeError.ProtoProps) serializable).setPrepareStackTrace(obj);
                return;
            default:
                ((NativeError) serializable).setStackDelegated(obj);
                return;
        }
    }
}
