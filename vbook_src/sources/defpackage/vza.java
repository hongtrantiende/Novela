package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vza  reason: default package */
/* loaded from: classes3.dex */
public final class vza {
    public static final vza a;
    public static final vza b;
    public static final vza c;
    public static final /* synthetic */ vza[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, vza] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, vza] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, vza] */
    static {
        ?? r0 = new Enum("Week", 0);
        a = r0;
        ?? r1 = new Enum("Month", 1);
        b = r1;
        ?? r2 = new Enum("Total", 2);
        c = r2;
        d = new vza[]{r0, r1, r2};
    }

    public static vza valueOf(String str) {
        return (vza) Enum.valueOf(vza.class, str);
    }

    public static vza[] values() {
        return (vza[]) d.clone();
    }
}
