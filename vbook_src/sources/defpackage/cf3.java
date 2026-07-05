package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cf3  reason: default package */
/* loaded from: classes3.dex */
public final class cf3 {
    public static final cf3 a;
    public static final cf3 b;
    public static final cf3 c;
    public static final /* synthetic */ cf3[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [cf3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [cf3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [cf3, java.lang.Enum] */
    static {
        ?? r0 = new Enum("None", 0);
        a = r0;
        ?? r1 = new Enum("Left", 1);
        b = r1;
        ?? r2 = new Enum("Right", 2);
        c = r2;
        d = new cf3[]{r0, r1, r2};
    }

    public static cf3 valueOf(String str) {
        return (cf3) Enum.valueOf(cf3.class, str);
    }

    public static cf3[] values() {
        return (cf3[]) d.clone();
    }
}
