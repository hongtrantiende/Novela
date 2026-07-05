package defpackage;

import java.util.List;
import java.util.ServiceLoader;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w67  reason: default package */
/* loaded from: classes.dex */
public abstract class w67 {
    public static final List a;

    static {
        ServiceLoader load = ServiceLoader.load(y04.class);
        load.getClass();
        a = sl1.C0(load);
    }
}
