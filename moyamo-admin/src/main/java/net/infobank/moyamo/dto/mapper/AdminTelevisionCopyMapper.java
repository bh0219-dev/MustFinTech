package net.infobank.moyamo.dto.mapper;

import net.infobank.moyamo.dto.PostingDto;
import net.infobank.moyamo.models.board.TelevisionWait;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AdminTelevisionCopyMapper {
    AdminTelevisionCopyMapper INSTANCE = Mappers.getMapper( AdminTelevisionCopyMapper.class );
    TelevisionWait of(PostingDto posting);
}
