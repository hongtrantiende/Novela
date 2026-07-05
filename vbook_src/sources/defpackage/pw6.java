package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pw6  reason: default package */
/* loaded from: classes3.dex */
public interface pw6 {
    boolean a();

    boolean b();

    boolean c();

    boolean d();

    boolean e();

    void f(String str, Throwable th);

    void g(String str);

    String getName();

    void h(String str);

    void i(String str);

    default boolean j(int i) {
        boolean z;
        String str;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            z = false;
                        } else {
                            throw null;
                        }
                    } else {
                        z = true;
                    }
                } else {
                    z = true;
                }
            } else {
                z = true;
            }
        } else {
            z = true;
        }
        if (z) {
            if (!z) {
                if (!z) {
                    if (!z) {
                        if (z) {
                            return c();
                        }
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i != 4) {
                                        if (i != 5) {
                                            str = "null";
                                        } else {
                                            str = "TRACE";
                                        }
                                    } else {
                                        str = "DEBUG";
                                    }
                                } else {
                                    str = "INFO";
                                }
                            } else {
                                str = "WARN";
                            }
                        } else {
                            str = "ERROR";
                        }
                        throw new IllegalArgumentException("Level [" + str + "] not recognized.");
                    }
                    return a();
                }
                return d();
            }
            return b();
        }
        return e();
    }
}
