package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nuc  reason: default package */
/* loaded from: classes.dex */
public final class nuc implements Executor {
    public static final nuc a;
    public static final Handler b;
    public static final /* synthetic */ nuc[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, nuc] */
    static {
        ?? r0 = new Enum("INSTANCE", 0);
        a = r0;
        c = new nuc[]{r0};
        b = new Handler(Looper.getMainLooper());
    }

    public static nuc valueOf(String str) {
        return (nuc) Enum.valueOf(nuc.class, str);
    }

    public static nuc[] values() {
        return (nuc[]) c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b.post(runnable);
    }
}
