package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jpb  reason: default package */
/* loaded from: classes3.dex */
public final class jpb {
    public static final jpb a;
    public static final jpb b;
    public static final jpb c;
    public static final jpb d;
    public static final /* synthetic */ jpb[] e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, jpb] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, jpb] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, jpb] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, jpb] */
    static {
        ?? r0 = new Enum("Start", 0);
        a = r0;
        ?? r1 = new Enum("End", 1);
        b = r1;
        ?? r2 = new Enum("Inner", 2);
        c = r2;
        ?? r3 = new Enum("NotByUser", 3);
        d = r3;
        e = new jpb[]{r0, r1, r2, r3};
    }

    public static jpb valueOf(String str) {
        return (jpb) Enum.valueOf(jpb.class, str);
    }

    public static jpb[] values() {
        return (jpb[]) e.clone();
    }
}
