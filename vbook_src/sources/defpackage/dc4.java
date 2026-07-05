package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dc4  reason: default package */
/* loaded from: classes.dex */
public final class dc4 extends xx5 {
    public final Field h;

    public dc4(Field field) {
        this.h = field;
    }

    @Override // defpackage.xx5
    public final xx5 A(Object obj) {
        z(obj);
        return this;
    }

    @Override // defpackage.eze
    public final Member m() {
        return this.h;
    }
}
