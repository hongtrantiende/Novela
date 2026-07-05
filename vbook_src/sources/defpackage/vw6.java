package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vw6  reason: default package */
/* loaded from: classes3.dex */
public final class vw6 {
    public static final vw6 a;
    public static final vw6 b;
    public static final /* synthetic */ vw6[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, vw6] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, vw6] */
    static {
        ?? r0 = new Enum("Default", 0);
        a = r0;
        ?? r1 = new Enum("OkHttp", 1);
        b = r1;
        c = new vw6[]{r0, r1};
    }

    public static vw6 valueOf(String str) {
        return (vw6) Enum.valueOf(vw6.class, str);
    }

    public static vw6[] values() {
        return (vw6[]) c.clone();
    }
}
