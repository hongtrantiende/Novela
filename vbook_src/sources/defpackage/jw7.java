package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jw7  reason: default package */
/* loaded from: classes3.dex */
public final class jw7 {
    public static final jw7 a;
    public static final jw7 b;
    public static final jw7 c;
    public static final /* synthetic */ jw7[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, jw7] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, jw7] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, jw7] */
    static {
        ?? r0 = new Enum("Default", 0);
        a = r0;
        ?? r1 = new Enum("UserInput", 1);
        b = r1;
        ?? r2 = new Enum("PreventUserInput", 2);
        c = r2;
        d = new jw7[]{r0, r1, r2};
    }

    public static jw7 valueOf(String str) {
        return (jw7) Enum.valueOf(jw7.class, str);
    }

    public static jw7[] values() {
        return (jw7[]) d.clone();
    }
}
