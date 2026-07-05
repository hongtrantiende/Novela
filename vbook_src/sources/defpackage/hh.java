package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hh  reason: default package */
/* loaded from: classes.dex */
public final class hh {
    public static final hh a;
    public static final hh b;
    public static final /* synthetic */ hh[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [hh, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [hh, java.lang.Enum] */
    static {
        ?? r0 = new Enum("SHOW_ORIGINAL", 0);
        a = r0;
        ?? r1 = new Enum("SHOW_TRANSLATED", 1);
        b = r1;
        c = new hh[]{r0, r1};
    }

    public static hh valueOf(String str) {
        return (hh) Enum.valueOf(hh.class, str);
    }

    public static hh[] values() {
        return (hh[]) c.clone();
    }
}
