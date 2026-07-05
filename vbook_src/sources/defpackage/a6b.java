package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a6b  reason: default package */
/* loaded from: classes3.dex */
public final class a6b {
    public static final a6b a;
    public static final a6b b;
    public static final a6b c;
    public static final /* synthetic */ a6b[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, a6b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, a6b] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, a6b] */
    static {
        ?? r0 = new Enum("FullyActive", 0);
        a = r0;
        ?? r1 = new Enum("Partial", 1);
        b = r1;
        ?? r2 = new Enum("Absent", 2);
        c = r2;
        d = new a6b[]{r0, r1, r2};
    }

    public static a6b valueOf(String str) {
        return (a6b) Enum.valueOf(a6b.class, str);
    }

    public static a6b[] values() {
        return (a6b[]) d.clone();
    }
}
