package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kl4  reason: default package */
/* loaded from: classes.dex */
public final class kl4 {
    public static final kl4 a;
    public static final /* synthetic */ kl4[] b;
    /* JADX INFO: Fake field, exist only in values array */
    kl4 EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [kl4, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kl4, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [kl4, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [kl4, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Visible", 0);
        ?? r1 = new Enum("Clip", 1);
        a = r1;
        b = new kl4[]{r0, r1, new Enum("ExpandIndicator", 2), new Enum("ExpandOrCollapseIndicator", 3)};
    }

    public static kl4 valueOf(String str) {
        return (kl4) Enum.valueOf(kl4.class, str);
    }

    public static kl4[] values() {
        return (kl4[]) b.clone();
    }
}
