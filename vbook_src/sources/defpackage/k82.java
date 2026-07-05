package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k82  reason: default package */
/* loaded from: classes3.dex */
public final class k82 {
    public static final k82 a;
    public static final k82 b;
    public static final k82 c;
    public static final k82 d;
    public static final k82 e;
    public static final /* synthetic */ k82[] f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, k82] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, k82] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, k82] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, k82] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, k82] */
    static {
        ?? r0 = new Enum("CPU_ACQUIRED", 0);
        a = r0;
        ?? r1 = new Enum("BLOCKING", 1);
        b = r1;
        ?? r2 = new Enum("PARKING", 2);
        c = r2;
        ?? r3 = new Enum("DORMANT", 3);
        d = r3;
        ?? r4 = new Enum("TERMINATED", 4);
        e = r4;
        f = new k82[]{r0, r1, r2, r3, r4};
    }

    public static k82 valueOf(String str) {
        return (k82) Enum.valueOf(k82.class, str);
    }

    public static k82[] values() {
        return (k82[]) f.clone();
    }
}
