package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e6a  reason: default package */
/* loaded from: classes.dex */
public final class e6a {
    public static final e6a a;
    public static final e6a b;
    public static final /* synthetic */ e6a[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [e6a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [e6a, java.lang.Enum] */
    static {
        ?? r0 = new Enum("EditableText", 0);
        a = r0;
        ?? r1 = new Enum("StaticText", 1);
        b = r1;
        c = new e6a[]{r0, r1};
    }

    public static e6a valueOf(String str) {
        return (e6a) Enum.valueOf(e6a.class, str);
    }

    public static e6a[] values() {
        return (e6a[]) c.clone();
    }
}
