package defpackage;

import java.util.concurrent.Executor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: udf  reason: default package */
/* loaded from: classes.dex */
public final class udf {
    public final Executor a;
    public final Runnable b;

    public /* synthetic */ udf(Runnable runnable, Executor executor) {
        this.a = executor;
        this.b = runnable;
    }
}
