package defpackage;

import java.util.concurrent.Executor;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e73  reason: default package */
/* loaded from: classes.dex */
public final class e73 implements Executor {
    public static final e73 a;
    public static final /* synthetic */ e73[] b;

    /* JADX WARN: Type inference failed for: r0v0, types: [e73, java.lang.Enum] */
    static {
        ?? r0 = new Enum("INSTANCE", 0);
        a = r0;
        b = new e73[]{r0};
    }

    public static e73 valueOf(String str) {
        return (e73) Enum.valueOf(e73.class, str);
    }

    public static e73[] values() {
        return (e73[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
