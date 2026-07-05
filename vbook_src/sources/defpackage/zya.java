package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zya  reason: default package */
/* loaded from: classes.dex */
public final class zya {
    public static final zya a;
    public static final zya b;
    public static final zya c;
    public static final /* synthetic */ zya[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [zya, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [zya, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [zya, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [zya, java.lang.Enum] */
    static {
        ?? r0 = new Enum("NoRequest", 0);
        a = r0;
        ?? r1 = new Enum("MatchFound", 1);
        b = r1;
        ?? r2 = new Enum("VisibleContentAbsentDuringTransition", 2);
        c = r2;
        d = new zya[]{r0, r1, r2, new Enum("NoMatchFound", 3)};
    }

    public static zya valueOf(String str) {
        return (zya) Enum.valueOf(zya.class, str);
    }

    public static zya[] values() {
        return (zya[]) d.clone();
    }
}
