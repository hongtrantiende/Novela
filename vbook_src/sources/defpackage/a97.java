package defpackage;

import com.highcapable.kavaref.platform.ExecutableAccessor;
import com.highcapable.kavaref.platform.FieldAccessor;
import com.highcapable.kavaref.platform.MemberAccessor;
import com.highcapable.kavaref.platform.MethodAccessor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a97  reason: default package */
/* loaded from: classes.dex */
public final class a97 implements xt4 {
    public static final a97 a = new Object();

    @Override // defpackage.xt4
    /* renamed from: a */
    public final MemberAccessor invoke(MemberAccessor memberAccessor) {
        MemberAccessor executableAccessor;
        gi1 a2 = cm9.a(ExecutableAccessor.class);
        if (a2.equals(cm9.a(FieldAccessor.class))) {
            executableAccessor = (MemberAccessor) new FieldAccessor(memberAccessor.getMember());
        } else if (a2.equals(cm9.a(MethodAccessor.class))) {
            executableAccessor = new MethodAccessor(memberAccessor.getMember());
        } else if (a2.equals(cm9.a(ExecutableAccessor.class))) {
            executableAccessor = new ExecutableAccessor(memberAccessor.getMember());
        } else {
            cp8.u(cm9.a(ExecutableAccessor.class), "Unsupported accessor type: ");
            return null;
        }
        return (ExecutableAccessor) executableAccessor;
    }
}
