package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iub  reason: default package */
/* loaded from: classes.dex */
public final class iub {
    public static final /* synthetic */ iub[] a = {new Enum("Filled", 0), new Enum("Outlined", 1)};
    /* JADX INFO: Fake field, exist only in values array */
    iub EF5;

    public static iub valueOf(String str) {
        return (iub) Enum.valueOf(iub.class, str);
    }

    public static iub[] values() {
        return (iub[]) a.clone();
    }
}
