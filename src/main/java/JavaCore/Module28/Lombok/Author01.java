package JavaCore.Module28.Lombok;

import lombok.*;

@Getter// set GETTERs for all fields
@Setter// set SETTERs for all fields
@NoArgsConstructor(access = AccessLevel.PRIVATE)// set CONSTRUCTOR with empty fields and change access modifier
@AllArgsConstructor// set CONSTRUCTOR with all fields inside
@RequiredArgsConstructor// set CONSTRUCTOR with special fields that marked @NonNull annotation
@Builder// set Builder class to current for Pattern Builder
@ToString(exclude = {"biography"})// to overwrite toString() and set special fields through exclude non-needed fields
//@EqualsAndHashCode// to overwrite equals() and hashcode()
@EqualsAndHashCode(onlyExplicitlyIncluded = true)// same as @EqualsAndHashCode but to include special fields marked with ".Include"
public class Author01 {
    @NonNull
    @EqualsAndHashCode.Include
    private String firstName;
    @NonNull
    private String lastName;
    private String biography;
    @Setter(AccessLevel.PROTECTED) // set SETTER to special field and change access modifier
    // from private to protected at target-folder
    private String someInfo;
}
