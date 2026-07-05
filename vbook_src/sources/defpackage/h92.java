package defpackage;

import android.os.Bundle;
import java.util.concurrent.Callable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h92  reason: default package */
/* loaded from: classes.dex */
public final class h92 implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ i92 b;

    public h92(i92 i92Var, long j) {
        this.b = i92Var;
        this.a = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.a);
        this.b.k.i(bundle);
        return null;
    }
}
