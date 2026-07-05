package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l96  reason: default package */
/* loaded from: classes3.dex */
public final class l96 {
    public static final l96 a;
    public static final l96 b;
    public static final /* synthetic */ l96[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, l96] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, l96] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, l96] */
    static {
        ?? r0 = new Enum("Singleton", 0);
        a = r0;
        ?? r1 = new Enum("Factory", 1);
        b = r1;
        c = new l96[]{r0, r1, new Enum("Scoped", 2)};
    }

    public static l96 valueOf(String str) {
        return (l96) Enum.valueOf(l96.class, str);
    }

    public static l96[] values() {
        return (l96[]) c.clone();
    }
}
