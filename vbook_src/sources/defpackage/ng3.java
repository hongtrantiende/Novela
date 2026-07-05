package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ng3  reason: default package */
/* loaded from: classes3.dex */
public final class ng3 {
    public static final ng3 a;
    public static final ng3 b;
    public static final ng3 c;
    public static final /* synthetic */ ng3[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ng3] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ng3] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ng3] */
    static {
        ?? r0 = new Enum("None", 0);
        a = r0;
        ?? r1 = new Enum("Downloaded", 1);
        b = r1;
        ?? r2 = new Enum("Downloading", 2);
        c = r2;
        d = new ng3[]{r0, r1, r2};
    }

    public static ng3 valueOf(String str) {
        return (ng3) Enum.valueOf(ng3.class, str);
    }

    public static ng3[] values() {
        return (ng3[]) d.clone();
    }
}
