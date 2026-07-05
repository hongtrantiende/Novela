package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uub  reason: default package */
/* loaded from: classes.dex */
public final class uub {
    public static final uub a;
    public static final uub b;
    public static final uub c;
    public static final uub d;
    public static final /* synthetic */ uub[] e;

    /* JADX WARN: Type inference failed for: r0v0, types: [uub, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [uub, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [uub, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [uub, java.lang.Enum] */
    static {
        ?? r0 = new Enum("StartInput", 0);
        a = r0;
        ?? r1 = new Enum("StopInput", 1);
        b = r1;
        ?? r2 = new Enum("ShowKeyboard", 2);
        c = r2;
        ?? r3 = new Enum("HideKeyboard", 3);
        d = r3;
        e = new uub[]{r0, r1, r2, r3};
    }

    public static uub valueOf(String str) {
        return (uub) Enum.valueOf(uub.class, str);
    }

    public static uub[] values() {
        return (uub[]) e.clone();
    }
}
