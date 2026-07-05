package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kw7  reason: default package */
/* loaded from: classes3.dex */
public final class kw7 {
    public static final kw7 a;
    public static final /* synthetic */ kw7[] b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, kw7] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, kw7] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, kw7] */
    static {
        ?? r0 = new Enum("Default", 0);
        a = r0;
        b = new kw7[]{r0, new Enum("UserInput", 1), new Enum("PreventUserInput", 2)};
    }

    public static kw7 valueOf(String str) {
        return (kw7) Enum.valueOf(kw7.class, str);
    }

    public static kw7[] values() {
        return (kw7[]) b.clone();
    }
}
