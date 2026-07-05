package defpackage;

import java.util.concurrent.Executor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l1  reason: default package */
/* loaded from: classes.dex */
public final class l1 {
    public static final l1 d = new l1();
    public final Runnable a;
    public final Executor b;
    public l1 c;

    public l1() {
        this.a = null;
        this.b = null;
    }

    public l1(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
