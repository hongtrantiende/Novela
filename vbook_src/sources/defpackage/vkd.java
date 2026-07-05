package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vkd  reason: default package */
/* loaded from: classes3.dex */
public final class vkd {
    public static final vkd a;
    public static final vkd b;
    public static final vkd c;
    public static final vkd d;
    public static final vkd e;
    public static final /* synthetic */ vkd[] f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, vkd] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, vkd] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, vkd] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, vkd] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, vkd] */
    static {
        ?? r0 = new Enum("Phones", 0);
        a = r0;
        ?? r1 = new Enum("SmallTablets", 1);
        b = r1;
        ?? r2 = new Enum("BigTablets", 2);
        c = r2;
        ?? r3 = new Enum("DesktopOne", 3);
        d = r3;
        ?? r4 = new Enum("DesktopTwo", 4);
        e = r4;
        f = new vkd[]{r0, r1, r2, r3, r4};
    }

    public static vkd valueOf(String str) {
        return (vkd) Enum.valueOf(vkd.class, str);
    }

    public static vkd[] values() {
        return (vkd[]) f.clone();
    }
}
