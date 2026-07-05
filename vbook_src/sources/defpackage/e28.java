package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e28  reason: default package */
/* loaded from: classes.dex */
public final class e28 {
    public final WeakReference a;
    public final Executor b;
    public final /* synthetic */ f28 c;

    public e28(f28 f28Var, xs2 xs2Var, Executor executor) {
        this.c = f28Var;
        this.a = new WeakReference(xs2Var);
        this.b = executor;
    }
}
