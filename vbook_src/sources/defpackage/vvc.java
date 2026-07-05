package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vvc  reason: default package */
/* loaded from: classes3.dex */
public final class vvc {
    public static final vvc a;
    public static final vvc b;
    public static final vvc c;
    public static final /* synthetic */ vvc[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [vvc, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [vvc, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [vvc, java.lang.Enum] */
    static {
        ?? r0 = new Enum("PURE_ASCII", 0);
        a = r0;
        ?? r1 = new Enum("ESC_ASCII", 1);
        b = r1;
        ?? r2 = new Enum("HIGHBYTE", 2);
        c = r2;
        d = new vvc[]{r0, r1, r2};
    }

    public static vvc valueOf(String str) {
        return (vvc) Enum.valueOf(vvc.class, str);
    }

    public static vvc[] values() {
        return (vvc[]) d.clone();
    }
}
