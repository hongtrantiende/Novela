package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ri8  reason: default package */
/* loaded from: classes.dex */
public final class ri8 {
    public static final ri8 a;
    public static final /* synthetic */ ri8[] b;
    /* JADX INFO: Fake field, exist only in values array */
    ri8 EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [ri8, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ri8, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [ri8, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Start", 0);
        ?? r1 = new Enum("Center", 1);
        a = r1;
        b = new ri8[]{r0, r1, new Enum("End", 2)};
    }

    public static ri8 valueOf(String str) {
        return (ri8) Enum.valueOf(ri8.class, str);
    }

    public static ri8[] values() {
        return (ri8[]) b.clone();
    }
}
