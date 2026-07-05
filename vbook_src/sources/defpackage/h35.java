package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h35  reason: default package */
/* loaded from: classes.dex */
public final class h35 {
    public static final h35 a;
    public static final h35 b;
    public static final h35 c;
    public static final /* synthetic */ h35[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, h35] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, h35] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, h35] */
    static {
        ?? r0 = new Enum("Cursor", 0);
        a = r0;
        ?? r1 = new Enum("SelectionStart", 1);
        b = r1;
        ?? r2 = new Enum("SelectionEnd", 2);
        c = r2;
        d = new h35[]{r0, r1, r2};
    }

    public static h35 valueOf(String str) {
        return (h35) Enum.valueOf(h35.class, str);
    }

    public static h35[] values() {
        return (h35[]) d.clone();
    }
}
