package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: soc  reason: default package */
/* loaded from: classes3.dex */
public final class soc {
    public static final soc a;
    public static final soc b;
    public static final soc c;
    public static final soc d;
    public static final /* synthetic */ soc[] e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, soc] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, soc] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, soc] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, soc] */
    static {
        ?? r0 = new Enum("SUCCESSFUL", 0);
        a = r0;
        ?? r1 = new Enum("REREGISTER", 1);
        b = r1;
        ?? r2 = new Enum("CANCELLED", 2);
        c = r2;
        ?? r3 = new Enum("ALREADY_SELECTED", 3);
        d = r3;
        e = new soc[]{r0, r1, r2, r3};
    }

    public static soc valueOf(String str) {
        return (soc) Enum.valueOf(soc.class, str);
    }

    public static soc[] values() {
        return (soc[]) e.clone();
    }
}
