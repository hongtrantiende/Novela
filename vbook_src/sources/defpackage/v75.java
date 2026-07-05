package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v75  reason: default package */
/* loaded from: classes.dex */
public abstract class v75 implements df4 {
    public final String a;
    public final List b;
    public final boolean c;

    public v75(String str, List list, boolean z) {
        this.a = str;
        this.b = Collections.unmodifiableList(list);
        this.c = z;
    }
}
