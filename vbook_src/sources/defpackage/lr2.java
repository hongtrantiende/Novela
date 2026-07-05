package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lr2  reason: default package */
/* loaded from: classes.dex */
public final class lr2 {
    public static final lr2 a;
    public static final /* synthetic */ lr2[] b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, lr2] */
    static {
        ?? r0 = new Enum("Text", 0);
        a = r0;
        b = new lr2[]{r0};
    }

    public static lr2 valueOf(String str) {
        return (lr2) Enum.valueOf(lr2.class, str);
    }

    public static lr2[] values() {
        return (lr2[]) b.clone();
    }
}
