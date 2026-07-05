package defpackage;

import java.util.concurrent.Executor;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eqe  reason: default package */
/* loaded from: classes.dex */
public final class eqe implements Executor {
    public static final eqe a;
    public static final /* synthetic */ eqe[] b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eqe] */
    static {
        ?? r0 = new Enum("INSTANCE", 0);
        a = r0;
        b = new eqe[]{r0};
    }

    public static eqe[] values() {
        return (eqe[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ((ovd) fz4.E().a).post(runnable);
    }
}
